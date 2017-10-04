package de.hef.nhoffmann.hackerorg.challenges.misc;

/**
 * @author Nils Hoffmann
 * Created on 01.10.2017
 */
public class LowerCount
{
    public static void main(String[] args)
    {
        String word = "mQmPtphqGrboHhmgaqVhCdwTwignlQvjIopDqVpgaNrwkAzVcnkHyNiPdSmgJmgrPiMjpnjdbuPucHnouwfKuPcybromnmbvfxJqRnnOvWsceZeYzRyqnkaaFsffjenxoIhqHnIzorlOdwZoxYmAuNwNnRppguwidvbtOqdbUngpZdbGqwYjfpLzPjRtwVwEqBbYmCqbKwuziCoEwPsIkJgruTbhdyWpvPztAodufjZxLaZcUeFaklSmeRfolohVbXoDfIqMqgIrQhzedqZlFwaBndQkQexBdLsCfXebrEfiOnSgYquyaqohxoDmLdDhwoOpgtkuRzeYziuvnuvnUuOtqasZueYpKfAkmKcJcWeocQvJguVsZfVovgrztAiryZivHqyMjoLyJdklKifmoWeOjVnogiiaBzDfrsWlOeAzPxltamqQiujZrpZrUcIlyktdJbhmNpDbltOlLnAqVhcxgObghpdcScgIiayqygUgwatiEzgzTsZgApUbbPynLfbzehzWsxcPbdcdfMucsCzjkWvjhMkiWuHfquqrcKwedqghiyHyMkSayRegeJcGw";
        final char[] charArray = word.toCharArray();

        int sum = 0;
        for (Character c : charArray)
        {
            int charValue = (int) c;
            if (c >= 97 && c <= 122)
            {
                sum++;
            }
        }
        System.out.println(sum);
    }
}
