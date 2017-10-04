package de.hef.nhoffmann.hackerorg.challenges.crypto;

import de.hef.nhoffmann.hackerorg.util.crypto.DidacticUtil;

/**
 * @author Nils Hoffmann
 * Created on 22.09.17
 */
public class DidacticXORCipher
{
    /*
    Here is a string of bytes encoded in hex:
    3d2e212b20226f3c2a2a2b
    These bytes have been encrypted with a cunning cipher: each character has been XOR'd with 79 (decimal).
    In cryptography, '79' is referred to as the 'key'.
    To decrypt it, perform the same XOR again. This will reveal your answer.

    Answer: random seed
     */

    public static void main(String[] args)
    {
        String result = DidacticUtil.decryptHexStringByXOR("3d2e212b20226f3c2a2a2b",79);
        System.out.println(result);
    }
}
