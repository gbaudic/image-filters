package fr.gwilhermbaudic.imagefilters.filters;

import java.awt.Color;
import java.awt.image.BufferedImage;

/**
 * A variation on the grayscale filter, with some yellow added
 * Code inspired from https://groups.google.com/forum/#!topic/comp.lang.java.programmer/nSCnLECxGdA
 * @author "Macky G"
 *
 */
class Sepia implements Filter {

	/**
	 *
	 * @param img Image to modify
	 */
	@Override
	public void apply(BufferedImage img) {

		// Play around with this.  20 works well and was recommended
		//   by another developer. 0 produces black/white image
		int sepiaDepth = 20;
		int sepiaIntensity = 30;

		int w = img.getWidth();
		int h = img.getHeight();
		
		for(int x = 0 ; x < w ; x++) {
			for(int y = 0 ; y < h ; y++) {
				// Get color channels of the pixel located at x,y.
				Color color = new Color(img.getRGB(x, y));
				int red = color.getRed();
				int green = color.getGreen();
				int blue = color.getBlue();
				
				int gry = (int) Math.floor(0.21*red + 0.71*green + 0.07*blue);
				red = green = blue = gry;
				red += (sepiaDepth * 2);
				green += sepiaDepth;
				
				red = Math.min(red,255);
				green = Math.min(green, 255);
				
				// Darken blue color to increase sepia effect
				blue -= sepiaIntensity;

				// normalize if out of bounds
				blue = Math.max(0, Math.min(blue, 255));
				
				// The following line inverts color channels
				color = new Color(red, green, blue);
				// Set the color of the pixel located at x,y.
				img.setRGB(x, y, color.getRGB());
			}
		}
		
	}

}
