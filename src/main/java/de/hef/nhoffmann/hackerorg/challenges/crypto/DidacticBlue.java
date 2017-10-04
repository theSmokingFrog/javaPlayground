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
public class DidacticBlue
{
    public static void main(String[] args) throws IOException
    {
        InputStream picture = Object.class.getResourceAsStream("/hackerorg/images/didacticBlue.png");
        final BufferedImage img = ImageIO.read(picture);

        // Fetches the blue values from the image
        final int[][] valuesFromImage = extractValuesFromImages(img);
    }


    private static int[][] extractValuesFromImages(final BufferedImage pImage) {
        final Raster imageData = pImage.getData();

        final int[][] blueValues = new int[pImage.getWidth()][pImage.getHeight()];

        for (int y = 0; y < pImage.getHeight(); y++)
        {
            for (int x = 0; x < pImage.getWidth(); x++)
            {
                int value = imageData.getPixel(x, 0, new int[3])[2];
                //System.out.println("x: " + x + "\ty: " + y + "\tvalue: " + value);
                blueValues[x][y] = value;
            }
        }
        return blueValues;
    }
}
