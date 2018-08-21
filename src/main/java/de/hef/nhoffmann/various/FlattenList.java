package de.hef.nhoffmann.various;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlattenList
{
    public static void main(String[] args)
    {
        final List<?> nonFlatList = Arrays.asList(1, Arrays.asList(2, 3), Arrays.asList(4, Arrays.asList("whoop", 6)));
        printList(flattenList(nonFlatList));
    }

    private static List<?> flattenList(List<?> pInputList)
    {
        List<Object> resultList = new ArrayList<>();

        pInputList.forEach(entry -> {
            if (entry instanceof List)
            {
                resultList.addAll(flattenList((List<?>) entry));
            }
            else
            {
                resultList.add(entry);
            }
        });

        return resultList;
    }

    private static void printList(List<?> pListToPrint)
    {
        System.out.println(Arrays.toString(pListToPrint.toArray()));
    }
}
