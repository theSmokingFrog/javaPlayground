package de.hef.nhoffmann.hackerorg.challenges.misc;

/**
 * @author Nils Hoffmann
 * Created on 24.09.17
 */
public class Valuation
{
    /*
    I have a special piece of text that represents a specific value. Here's how I calculate it:
    - Start reading left to right
    - If a character is a digit, I add it to my sum
    - If it's an 'x', I remove it and go left two places
    - Continue until I hit the end of the string
    For example, the string '123x456' has a value of 26.
     */

    public static void main(String[] args)
    {
        String encoded = "93752xxx746x27x1754xx90x93xxxxx238x44x75xx08750912738x8461x8759383xx328x4x4935903x6x5550360535004x0xx945958961296x267x8842xxx5x6xx61x4x48482x80xxx83316843x7x4x83x9521731xxx25x51xx457x6x5x9698222x771237745034x5133592x27xx8x87xx35221x36x0x50x23x7x63x998418xx";
        final char[] encodedAsChars = encoded.toCharArray();
        int sum;

        for (int i = 0; i < encodedAsChars.length; i++)
        {
                final int aChar = encodedAsChars[i];
        }
    }
}
