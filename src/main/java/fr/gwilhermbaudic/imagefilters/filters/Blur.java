package fr.gwilhermbaudic.imagefilters.filters;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.WritableRaster;

/**
 * Implementation of a basic square (3*3) blur
 * @author g.baudic
 */
class Blur implements Filter {

	@Override
	public void apply(BufferedImage img) {
		// Copy image so we get a clean source for our pixel data
		ColorModel cm = img.getColorModel();
	    boolean isAlphaPremultiplied = cm.isAlphaPremultiplied();
	    WritableRaster raster = img.copyData(img.getRaster().createCompatibleWritableRaster());
		
		BufferedImage img2 = new BufferedImage(cm, raster, isAlphaPremultiplied, null);
		
		for (int y = 0; y < img.getHeight(); ++y) {
			for (int x = 0; x < img.getWidth(); ++x) {
				int nbPixels = 0;
				int[] components = {0, 0, 0};
				for (int i = 0 ; i < 2 ; i++) {
					for(int j = 0 ; j < 2 ; j++) {
						if (y + i - 1 >= 0 && y + i - 1 < img.getHeight()
						   && x + j - 1 >= 0 && x + j - 1 < img.getWidth()) {
							// Get color channels of the pixel located at x,y.
							Color color = new Color(img2.getRGB(x + j - 1, y + i - 1));
							components[0] += color.getRed();
							components[1] += color.getGreen();
							components[2] += color.getBlue();
							nbPixels++;
						}
					}
				}
				
				Color color = new Color(components[0] / nbPixels , components[1] / nbPixels, components[2] / nbPixels);
				// Set the color of the pixel located at x,y.
				img.setRGB(x, y, color.getRGB());
			}
		}

	}

}
