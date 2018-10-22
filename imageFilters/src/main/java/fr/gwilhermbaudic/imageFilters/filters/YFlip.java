package fr.gwilhermbaudic.imageFilters.filters;

import java.awt.Color;
import java.awt.image.BufferedImage;

class YFlip implements Filter {

	public void apply(BufferedImage img) {
		for (int y = 0; y < img.getHeight()/2; ++y) {
			for (int x = 0; x < img.getWidth(); ++x) {
				// Get color channels of the pixel located at x,y.
				Color color = new Color(img.getRGB(x, y));

				// Set the color of the pixel located at x,y.
				img.setRGB(x, y, img.getRGB(x, img.getHeight()-y-1));
				img.setRGB(x, img.getHeight()-y-1, color.getRGB());
			}
		}

	}

}
