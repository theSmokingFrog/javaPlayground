package de.hef.nhoffmann.crypto.util;

import javax.xml.bind.DatatypeConverter;

/**
 * @author Nils Hoffmann
 * Created on 22.09.17
 */
public class DidacticUtil
{
    public static String decryptHexStringByXOR(final String pEncryptedHexString, final int pXORKey) {
        String result = "";
        final byte[] encodedString = DatatypeConverter.parseHexBinary(pEncryptedHexString);
        for (int i = 0; i < encodedString.length; i++)
        {
            encodedString[i] = (byte) (encodedString[i] ^ pXORKey);
        }
        for (byte b : encodedString)
        {
            result = result + (char) b;
        }
        return result;
    }
}
