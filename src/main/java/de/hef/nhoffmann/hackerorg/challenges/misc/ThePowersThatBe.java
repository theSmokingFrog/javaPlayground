package de.hef.nhoffmann.hackerorg.challenges.misc;

import java.math.BigInteger;

/**
 * @author Nils Hoffmann
 * Created on 30.09.2017
 */
public class ThePowersThatBe
{
    /*
    x = ((17 to_the_power_of 39) to_the_power_of 11)
    Now take every 33rd digit of x, starting with the first (most significant), and stick them together. That's your answer.
     */

    public static void main(String[] args)
    {
        BigInteger _17 = new BigInteger("17");
        BigInteger _39 = new BigInteger("39");
        BigInteger _11 = new BigInteger("11");

        final BigInteger pow = (_17.pow(_39.intValue())).pow(_11.intValue());
        final char[] result = pow.toString().toCharArray();

        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < result.length; i = i+33)
        {
            sb.append(result[i]);
        }
        System.out.println(sb.toString());
    }
}
