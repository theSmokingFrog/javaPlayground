package de.hef.nhoffmann.hackerorg.challenges.crypto;

import java.awt.image.Raster;
import java.io.IOException;
import java.io.InputStream;

import javax.imageio.ImageIO;

/**
 * @author Nils Hoffmann
 * Created on 22.09.17
 */
public class DidacticRed
{
    /*
    Here we see another image, a four-pixel wide and single pixel high line:

    /images/didacticRed.png

    Unlike the previous challenge, the only color here is red. Therefore,
    it's probably a good start to assume that the signal (the information we're trying
    to extract from the source) is just the red component, which means 8 bits per pixel.
    To answer this challenge, submit these four red values concatenated together,
    expressed in hexadecimal. Ie: something like '92AB7DF2'.

    A hint: the answer is based on an English word.
    */

    public static void main(String[] args) throws IOException
    {
        InputStream picture = Object.class.getResourceAsStream("/hackerorg/images/didacticRed.png");
        final Raster imageData = ImageIO.read(picture).getData();

        for (int x = 0; x < 4; x++)
        {
            int redValue = imageData.getPixel(x, 0, new int[3])[0];
            System.out.printf(Integer.toHexString(redValue));
        }
    }
}
