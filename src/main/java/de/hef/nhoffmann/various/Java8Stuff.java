package de.hef.nhoffmann.various;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class Java8Stuff
{
    public static void main(String[] args)
    {
        advancedStreams();
        basicStream();
        comparatorTests();
        mappingWithStreams();

    }

    private static void advancedStreams()
    {
        final List<Person> personList = Arrays.asList(
                new Person(20, "A"),
                new Person(25, "B"),
                new Person(26, "C"),
                new Person(27, "D"),
                new Person(19, "E"),
                new Person(6, "F")
        );
        final List<Person> personList2 = Arrays.asList(
                new Person(42, "G"),
                new Person(68, "H"),
                new Person(12, "I"),
                new Person(16, "J"),
                new Person(96, "K"),
                new Person(32, "L"),
                new Person(13, "M"),
                new Person(41, "N")
        );
        Stream.concat(personList.stream(), personList2.stream()); // Preserves Order
        // Stream.of(personList.stream(), personList2.stream()).flatMap(Function.identity()).forEach(System.out::println);

        final List<String> string1 = Arrays.asList(
                "Weder das Amts- noch das Landgericht hatten diese Aufnahmen berücksichtigt.",
                "Da solche Aufnahmen gegen datenschutzrechtliche Bestimmungen",
                "verstießen, dürften sie nicht als Beweis herangezogen werden,",
                "hatten die Magdeburger Richter argumentiert. Der BGH sah"
        );
        final List<String> string2 = Arrays.asList(
                "second month back at the helm of Annotated Monthly, and I’m using the opportunity to link to some",
                "of the backlog of articles I amassed while I was away.",
                "This month’s is a bumper edition, including a huge section on",
                "culture as I believe very strongly that developers need to understand so much more than just coding."
        );

        Stream.of(string1.stream(), string2.stream()).flatMap(Function.identity()).flatMap(line -> Pattern.compile(" ").splitAsStream(line)).forEach(System.out::println);

    }

    private static void basicStream()
    {
        final List<Person> personList = Arrays.asList(
                new Person(20, "A"),
                new Person(25, "B"),
                new Person(26, "C"),
                new Person(27, "D"),
                new Person(19, "E"),
                new Person(6, "F"),
                new Person(42, "G"),
                new Person(68, "H"),
                new Person(12, "I"),
                new Person(16, "J"),
                new Person(96, "K"),
                new Person(32, "L"),
                new Person(13, "M"),
                new Person(41, "N"));
        // Computation of the average age of the people older than 20

        // Without Java8
        int sum = 0;
        int count = 0;
        for (Person p : personList)
        {
            if (p.getAge() > 20)
            {
                sum += p.getAge();
                count++;
            }
        }
        int average = count > 0 ? (sum / count) : 0;

        // With Java8
        personList.stream()
                // .skip(2) // Skips the first two
                // .limit(3) // keeps the next 3
                .map(Person::getAge)
                .filter(i -> i > 20)
                // .peek(System.out::println)
                .reduce((a, b) -> a + b);
    }

    private static void comparatorTests()
    {
        final Person person1 = new Person(20, "World");
        final Person person2 = new Person(20, "Hello");

        final List<Person> personList = Arrays.asList(person1, person2);

        Comparator<Person> comparatorAge = (p1, p2) -> p1.getAge() - p2.getAge(); //NOSONAR
        Function<Person, Integer> funcAge = p -> p.getAge(); //NOSONAR
        Function<Person, String> funcMethodAge = Person::getName; //NOSONAR

        Comparator.comparing(funcAge);
        Comparator.comparing(Person::getAge);
        Comparator.comparing(Person::getAge).thenComparing(Person::getName);

        // personList.removeIf(p -> p.getAge() > 15);
        personList.replaceAll(p -> new Person(p.age * 2, p.name));
        personList.sort(Comparator.comparing(Person::getAge));
    }

    private static void mappingWithStreams()
    {
        final Person person1 = new Person(20, "World");
        final Person person2 = new Person(20, "Hello");

        final City c1 = new City("Braunschweig");
        final City c2 = new City("Goslar");

        final Map<City, List<Person>> cityListMap = new HashMap<>();
        final Map<City, List<Person>> theOtherCityListMap = new HashMap<>();

        cityListMap.get(c1); // Returns null
        cityListMap.getOrDefault(c1, Collections.EMPTY_LIST); // Returns c1 or Empty List

        cityListMap.putIfAbsent(c1, new ArrayList<>());
        cityListMap.get(c1).add(person1);

        cityListMap.computeIfAbsent(c2, pCity -> new ArrayList<>()).add(person2);

        theOtherCityListMap.forEach((k, v) -> cityListMap.merge(k, v, ((pPeople, pPeople2) -> {
            pPeople.addAll(pPeople2);
            return pPeople;
        })));
    }

    private static class Person
    {
        private Integer age;
        private String name;

        public Person(final Integer pAge, final String pName)
        {
            age = pAge;
            name = pName;
        }

        public Integer getAge()
        {
            return age;
        }

        public void setAge(final Integer pAge)
        {
            age = pAge;
        }

        public String getName()
        {
            return name;
        }

        public void setName(final String pName)
        {
            name = pName;
        }

        @Override
        public String toString()
        {
            return "Person{" +
                    "age=" + age +
                    ", name='" + name + '\'' +
                    '}';
        }
    }

    private static class City
    {
        private String name;

        public City(final String pName)
        {
            name = pName;
        }

        public String getName()
        {
            return name;
        }

        public void setName(final String pName)
        {
            name = pName;
        }

        @Override
        public String toString()
        {
            return "City{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }
}
