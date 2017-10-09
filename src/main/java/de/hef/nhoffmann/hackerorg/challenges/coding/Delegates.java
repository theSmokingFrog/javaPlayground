package de.hef.nhoffmann.hackerorg.challenges.coding;

import de.hef.nhoffmann.hackerorg.util.coding.CodingUtil;

/**
 * @author Nils Hoffmann
 * Created on 06.10.17
 */
public class Delegates
{
    public static void main(String[] args)
    {
        long barack = 0;
        long hillary = 0;

        while (barack <= 2118)
        {
            if (CodingUtil.isPerfectSquare(barack))
            {
                hillary = hillary + (2 * barack);
            }
            else
            {
                hillary = hillary + barack;
            }

            barack++;
        }

        System.out.println(hillary);
    }

}
