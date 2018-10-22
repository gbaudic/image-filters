package fr.gwilhermbaudic.imageFilters.filters;

import java.awt.Color;
import java.awt.image.BufferedImage;

class XFlip implements Filter {

	public void apply(BufferedImage img) {
		for (int x = 0; x < img.getWidth()/2; ++x) {
			for (int y = 0; y < img.getHeight(); ++y) {
				// Get color channels of the pixel located at x,y.
				Color color = new Color(img.getRGB(x, y));

				// Set the color of the pixel located at x,y.
				img.setRGB(x, y, img.getRGB(img.getWidth()-x-1, y));
				img.setRGB(img.getWidth()-x-1, y, color.getRGB());
			}
		}

	}

}
