package de.hef.nhoffmann.hackerorg.challenges.web;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Nils Hoffmann
 * Created on 30.09.2017
 */
public class LoremIpsum
{
    public static void main(String[] args)
    {
        Map<String, Long> result = new HashMap<>();

        try (
                InputStream loremInputStream = Object.class.getResourceAsStream("/hackerorg/text/lorem.txt");
                InputStreamReader loremISR = new InputStreamReader(loremInputStream);
                BufferedReader loremBR = new BufferedReader(loremISR))
        {
            String line;
            while ((line = loremBR.readLine()) != null)
            {
                if (line.length() > 0)
                {
                    line = line.replace(",", "").replace(".", "");
                    final String[] splittedLine = line.split(" ");
                    for (String word : splittedLine)
                    {
                        Long longVal = result.get(word);
                        if (longVal == null) {
                            longVal = 1L;
                        } else {
                            longVal += 1;
                        }
                        result.put(word, longVal);
                    }
                }
            }
        }
        catch (IOException pE)
        {
            pE.printStackTrace();
        }

        for (Map.Entry<String, Long> entry : result.entrySet())
        {
            if (entry.getValue() == 1) {
                System.out.println(entry.getKey());
            }
        }

    }
}
