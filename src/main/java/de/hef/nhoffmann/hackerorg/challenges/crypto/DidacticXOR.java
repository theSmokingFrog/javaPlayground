package de.hef.nhoffmann.hackerorg.challenges.crypto;

/**
 * @author Nils Hoffmann
 * Created on 22.09.17
 */
public class DidacticXOR
{
    /*
    Let's take the following byte, expressed in hexadecimal:
    9f
    Please XOR this with the following byte:
    c7
    Now, what is the ASCII character of the result?

    Answer: x
     */
    public static void main(String[] args)
    {
        final int result = 0x9f ^ 0xc7;
        System.out.println((char) result);
    }
}
