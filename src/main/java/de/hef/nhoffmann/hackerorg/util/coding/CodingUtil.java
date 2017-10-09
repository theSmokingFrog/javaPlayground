package de.hef.nhoffmann.hackerorg.util.coding;

/**
 * @author Nils Hoffmann
 * Created on 24.09.17
 */
public class CodingUtil
{
    public static boolean isPerfectSquare(final long pInput)
    {
        double sqrt = Math.sqrt(pInput);
        int x = (int) sqrt;
        return (Math.pow(sqrt,2) == Math.pow(x,2));
    }
}
