package de.hef.nhoffmann.hackerorg.challenges.crypto;

import de.hef.nhoffmann.hackerorg.util.crypto.DidacticUtil;

/**
 * @author Nils Hoffmann
 * Created on 22.09.17
 */
public class DidacticXORCipher2
{
    /*
    Here is a string of bytes encoded in hex:
    948881859781c4979186898d90c4c68c85878f85808b8b808881c6c4828b96c4908c8d97c4878c858888818a8381
    This sequence has been encrypted with the same cipher as in the previous challenge: each character
    has been XOR'd with a certain byte. To decrypt it, perform the same XOR again. This time, you will
    have to discover the key yourself.

    Answer: hackadoodle
     */

    public static void main(String[] args)
    {

        // Trying to find the key by brute force...
        for (int i = 0; i < 0xFF; i++)
        {
            String result = DidacticUtil.decryptHexStringByXOR("948881859781c4979186898d90c4c68c85878f85808b8b808881c6c4828b96c4908c8d97c4878c858888818a8381",
                    i);
            System.out.println(i + "\t" + result);
        }
        // @228	please submit "hackadoodle" for this challenge
    }
}
