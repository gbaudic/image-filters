package fr.gwilhermbaudic.imageFilters.filters;

import java.awt.Color;
import java.awt.image.BufferedImage;

/**
 * A variation on the grayscale filter, but with only two colours in the output
 * Ugly output expected :-)
 * @author g.baudic
 *
 */
class BlackWhite implements Filter {

	public void apply(BufferedImage img) {
		for (int y = 0; y < img.getHeight(); ++y) {
			for (int x = 0; x < img.getWidth(); ++x) {
				// Get color channels of the pixel located at x,y.
				Color color = new Color(img.getRGB(x, y));
				int graylevel = (int) Math.floor(0.21*color.getRed()+0.71*color.getGreen()+0.07*color.getBlue());
				// Degrade to black or white, a famous song by Michael Jackson King of Pop Rest In Peace
				if(graylevel > 255*0.4){
					color = Color.WHITE;
				} else {
					color = Color.BLACK;
				}
				// Set the color of the pixel located at x,y.
				img.setRGB(x, y, color.getRGB());
			}
		}
		
	}

}
