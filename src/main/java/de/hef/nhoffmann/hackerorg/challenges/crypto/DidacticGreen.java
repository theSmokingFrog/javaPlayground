package de.hef.nhoffmann.hackerorg.challenges.crypto;

import java.awt.image.BufferedImage;
import java.awt.image.Raster;
import java.io.IOException;
import java.io.InputStream;

import javax.imageio.ImageIO;

/**
 * @author Nils Hoffmann
 * Created on 22.09.17
 */
public class DidacticGreen
{
    /*
    Examine this image:

    /images/didacticGreen.png
    Like the previous challenge, these pixels represent a series of bytes.
    This time, there are obviously too many bytes for the answer to just
    be the values stuck together. Your task here is to examine these bytes
    for their own meaning, and get the answer from there.
     */

    public static void main(String[] args) throws IOException
    {
        InputStream picture = Object.class.getResourceAsStream("/hackerorg/images/didacticGreen.png");
        final BufferedImage bufferedImage = ImageIO.read(picture);
        final Raster imageData = bufferedImage.getData();

        final char[] word = new char[bufferedImage.getWidth()];

        for (int x = 0; x < bufferedImage.getWidth(); x++)
        {
            word[x] = (char) imageData.getPixel(x, 0, new int[3])[1];
        }
        System.out.println(String.valueOf(word));
    }
}
