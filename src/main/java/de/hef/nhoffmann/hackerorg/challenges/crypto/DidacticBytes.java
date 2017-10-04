package de.hef.nhoffmann.hackerorg.challenges.crypto;

import java.nio.ByteBuffer;

/**
 * @author Nils Hoffmann
 * Created on 22.09.17
 */
public class DidacticBytes
{
    /*
    Let us take the following three decimal numbers:
    199, 77, 202
    Convert each one into a byte. (Even though 77 does not require all 8 bits to express itself,
    when dealing with a group of data, we usually keep it in a consistent form.) Now, take those
    three bytes and combine them to form a 24-bit unsigned integer. The 199 byte is the high byte
    (most significant) and so forth. Please enter that 24-bit integer in decimal form, and that
    is your answer. (Hint: your answer will not be '19977202'!)

    Answer: 13061578
     */
    public static void main(String[] args)
    {
        String hex1 = Integer.toHexString(199);
        String hex2 = Integer.toHexString(77);
        String hex3 = Integer.toHexString(202);
        final int i = 0xc74dca;
        System.out.println(i);
    }
}
