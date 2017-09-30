package de.hef.nhoffmann.crypto.challenges;

/**
 * @author Nils Hoffmann
 * Created on 24.09.17
 */
public class Ave
{
    // Potenziell Ceasar-Chiffre? // answer will be deadmanschest
    public static void main(String[] args)
    {
        String ceasar = "cqrb lryqna rb fjh, fjh qjamna cqjw axc cqracnnw. qnan, hxd wnena twxf qxf oja cx bqroc! xq kh cqn fjh, cqn jwbfna rb mnjmvjwblqnbc.";

        StringBuffer sb = new StringBuffer();
        for (Character c : ceasar.toCharArray())
        {
            if (c != ' ' && c != ',' && c != '.' && c != '!')
            {
                int newValue = (c - 9);
                if (newValue < 97)
                {
                    newValue = 122 - newValue;
                }

                sb.append((char) newValue);
            }
            else
            {
                sb.append(c);
            }
        }
        System.out.println(sb.toString() + "\n");
    }
}
