package de.hef.nhoffmann.hackerorg.challenges.coding;

/**
 * @author Nils Hoffmann
 * Created on 01.10.2017
 */
public class RandomProblem
{
    public static void main(String[] args)
    {
        for (int i = Integer.MIN_VALUE; i < Integer.MAX_VALUE; i++)
        {
            try
            {
                bucketFromRandom(i);
            }
            catch (ArrayIndexOutOfBoundsException pEx)
            {
                System.out.println("Solution Value found: " + i);
            }
        }
    }

    private static int bucketFromRandom(int randomNumber)
    {
        int a[] = new int[10];
        for (int i = 0; i < a.length; i++)
        {
            a[i] = i * randomNumber;
        }
        int index = Math.abs(randomNumber) % a.length;
        return a[index];
    }

}
