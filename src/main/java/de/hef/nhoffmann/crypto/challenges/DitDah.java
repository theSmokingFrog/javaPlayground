package de.hef.nhoffmann.crypto.challenges;

import de.hef.nhoffmann.crypto.util.MorseUtil;

/**
 * @author Nils Hoffmann
 * Created on 24.09.17
 */
public class DitDah
{
    /*
        - .... . .- -. ... .-- . .-. .. ... .... --- .- .-. ... .
     */

    public static void main(String[] args)
    {
        String morseCode = "- .... . .- -. ... .-- . .-. .. ... .... --- .- .-. ... .";
        final String[] morseCodeSplitted = morseCode.split(" ");
        final char[] translationResult = new char[morseCodeSplitted.length];

        for (int i = 0; i < morseCodeSplitted.length; i++)
        {
            translationResult[i] = MorseUtil.translateFromMorseCode(morseCodeSplitted[i]);
        }
        System.out.println(String.valueOf(translationResult));
    }
}
