package de.hef.nhoffmann.misc;

import java.math.BigInteger;

/**
 * @author Nils Hoffmann
 * Created on 01.10.2017
 */
public class TheXFactor
{
    public static void main(String[] args)
    {
        System.out.println("Initialization");
        BigInteger initial = new BigInteger("7393913335919140050521110339491123405991919445111971");
        BigInteger _2 = new BigInteger("2");

        int max_teiler = 0;

        System.out.println("Calculation: Part 1");
        if (initial.mod(_2).compareTo(BigInteger.valueOf(0)) == 0)
        {
            max_teiler = 2;
            while (initial.mod(_2).equals(BigInteger.valueOf(0)))
            {
                initial = initial.divide(BigInteger.valueOf(2));
            }
        }
        else
        {
            max_teiler = 1;
        }

        BigInteger teiler = new BigInteger("3");

        System.out.println("Calculation: Part 2");
        while (initial.compareTo(BigInteger.valueOf(1)) >= 1)
        {
            if (initial.mod(teiler).compareTo(BigInteger.valueOf(0)) == 0)
            {
                System.out.println("if - Mod");
                while (initial.mod(teiler).compareTo(BigInteger.valueOf(0)) == 0)
                {
                    System.out.println("While - Mod");
                    initial = initial.divide(teiler);
                    System.out.println(initial);
                }
                max_teiler = teiler.intValue();
            }
            teiler = teiler.add(_2);
        }

        System.out.println(max_teiler);
    }
}
