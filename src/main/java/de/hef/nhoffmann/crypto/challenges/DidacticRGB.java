package de.hef.nhoffmann.crypto.challenges;

import java.io.IOException;
import java.io.InputStream;

import javax.imageio.ImageIO;

/**
 * @author Nils Hoffmann
 * Created on 22.09.17
 */
public class DidacticRGB
{
    /*

    /images/didacticRGB.png

    This image is actually only 1 pixel by 1 pixel, and is stretched out here so you can see it.
    What can such an image represent? Pixels are commonly composed on a computer of red, green,
    and blue components. Each component can be any number of bits -- the more bits, the more
    detail an image can reflect. A common number of bits per color is eight. If we look at this
    single pixel, we get three colors of eight bits each, which equals 24 bits of data total.
    What to do with those 24 bits? For this challenge, express it as a decimal integer.
    That is your answer. (In other words, the answer looks something like '12345678'.
    These are all 24 bits considered as one single number in decimal.)

    Color Representation in native RGB : 156 / 88 / 197
     */

    public static void main(String[] args) throws IOException
    {
        InputStream picture = Object.class.getResourceAsStream("/images/didacticRGB.png");

        for (int i : ImageIO.read(picture).getData().getPixel(0,0, new int[3]))
        {
            System.out.println(Integer.toHexString(i));
        } // 0x9c54c6

        System.out.println(0x9c54c6);
    }
}
