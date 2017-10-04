package de.hef.nhoffmann.hackerorg.challenges.crypto;

import java.util.regex.Pattern;

import de.hef.nhoffmann.hackerorg.util.crypto.DidacticUtil;

/**
 * @author Nils Hoffmann
 * Created on 22.09.17
 */
public class DidacticXORLongCipher
{

    /*
    Here is a string of bytes encoded in hex:
    8776459cf37d459fbb7b5ecfbb7f5fcfb23e478aaa3e4389f378439aa13e4e96a77b5fc1f358439df36a4486a03e4381b63e5580a66c0c8ebd6d5b8aa13e459cf34e4d9fa67f02cf90714288a17f589abf7f5886bc705fcfbc700c96bc6b5ecfb7775f8cbc68499daa3f
    This sequence has been encrypted with the same cipher as in Didactic XOR 2,
    except here the key is four-bytes long. So the first byte of the plaintext is enciphered
    with the first byte of the key, and so on, until the fifth byte of the plaintext gets
    enciphered with the first byte of the key again.
     */

    public static void main(String[] args) throws InterruptedException
    {
        Pattern p = Pattern.compile("^.*$");

        for (int i = 0; i < 0xFFFF; i++)
        {
            // FIXME: METHOD IS WRONG, ALGORITHM IS WRONG
            String result = DidacticUtil.decryptHexStringByXOR("8776459cf37d459fbb7b5ecfbb7f5fcfb23e478aaa3e4389f378439aa13e4e96a77b5fc1f358439df36a4486a03e4381b63e5580a66c0c8ebd6d5b8aa13e459cf34e4d9fa67f02cf90714288a17f589abf7f5886bc705fcfbc700c96bc6b5ecfb7775f8cbc68499daa3f",
                    i);
            if (p.matcher(result).find()) {
                System.out.println(i + "\t" + result);
            }
        }
    }
}
