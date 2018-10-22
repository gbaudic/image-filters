package fr.gwilhermbaudic.imageFilters.filters;

import java.awt.Color;
import java.awt.image.BufferedImage;

class Grayscale implements Filter {

	public void apply(BufferedImage img) {
		//0,21R+ 0,71 G+ 0,07 B
		for (int y = 0; y < img.getHeight(); ++y) {
			for (int x = 0; x < img.getWidth(); ++x) {
				// Get color channels of the pixel located at x,y.
				Color color = new Color(img.getRGB(x, y));
				int graylevel = (int) Math.floor(0.21*color.getRed()+0.71*color.getGreen()+0.07*color.getBlue());
				// The following line creates the gray level as a color
				color = new Color(graylevel, graylevel, graylevel);
				// Set the color of the pixel located at x,y.
				img.setRGB(x, y, color.getRGB());
			}
		}

	}

}
