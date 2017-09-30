package de.hef.nhoffmann.crypto.util;

import java.util.HashMap;

/**
 * @author Nils Hoffmann
 * Created on 24.09.17
 */
public class MorseUtil
{
    private static HashMap<String, Character> translationTable = initialize();

    private static HashMap<String, Character> initialize()
    {
        final HashMap<String, Character> map = new HashMap<>();
        map.put(".-",'A');
        map.put("-...",'B');
        map.put("-.-.",'C');
        map.put("-..",'D');
        map.put(".",'E');
        map.put("..-.",'F');
        map.put("--.",'G');
        map.put("....",'H');
        map.put("..",'I');
        map.put(".---",'J');
        map.put("-.-",'K');
        map.put(".-..",'L');
        map.put("--",'M');
        map.put("-.",'N');
        map.put("---",'O');
        map.put(".--.",'P');
        map.put("--.-",'Q');
        map.put(".-.",'R');
        map.put("...",'S');
        map.put("-",'T');
        map.put("..-",'U');
        map.put("...-",'V');
        map.put(".--",'W');
        map.put("-..-",'X');
        map.put("-.--",'Y');
        map.put("--..",'Z');
        return map;
    }

    public static Character translateFromMorseCode(final String pMorseCodeCharacter) {
        Character result = translationTable.get(pMorseCodeCharacter);
        return result != null ? result : '?';
    }
}
