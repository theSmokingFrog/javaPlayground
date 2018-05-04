package de.hef.nhoffmann.playground;

import java.util.Arrays;

import org.apache.commons.lang3.ArrayUtils;

public class Quicksort extends Object
{
    public static void main(String[] args)
    {
        final int[] initialInts = { 25, 17, 32, 56, 25, 19, 8, 66, 29, 6, 20, 29, 35, 28, 41, 7, 14, 50, 33, 21, 21, 60, 18, 12 };
        System.out.println(Arrays.toString(initialInts));
        int[] result = quicksort(initialInts);
        System.out.println(Arrays.toString(result));
    }

    private static int[] quicksort(int[] pIntArr)
    {
        if (pIntArr.length > 1)
        {
            // Select Pivot
            int pivot = pIntArr[0];

            int[] smallerAsPList = {};
            int[] biggerOrEqualToPList = {};
            // Create Partial Lists
            for (int i = 1; i < pIntArr.length; i++)
            {
                if (pIntArr[i] < pivot)
                {
                    smallerAsPList = addToArray(smallerAsPList, pIntArr[i]);
                }
                else
                {
                    biggerOrEqualToPList = addToArray(biggerOrEqualToPList, pIntArr[i]);
                }
            }

            // Quicksort the lists
            final int[] sortedSmaller = quicksort(smallerAsPList);
            final int[] sortedBigger = quicksort(biggerOrEqualToPList);
            final int[] pivotArr = { pivot };

            // concat arrays
            int[] result = new int[0];

            result = ArrayUtils.addAll(result, sortedSmaller);
            result = ArrayUtils.addAll(result, pivotArr);
            result = ArrayUtils.addAll(result, sortedBigger);

            return result;
        }
        else
        {
            return pIntArr;
        }
    }

    private static int[] addToArray(final int[] pArray, final int pNumberToAdd)
    {
        final int[] result = new int[pArray.length + 1];
        System.arraycopy(pArray, 0, result, 0, pArray.length);
        result[pArray.length] = pNumberToAdd;
        return result;
    }
}
