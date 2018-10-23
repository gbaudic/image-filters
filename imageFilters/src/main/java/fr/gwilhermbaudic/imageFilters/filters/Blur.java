package fr.gwilhermbaudic.imageFilters.filters;

import java.awt.image.BufferedImage;

class Blur implements Filter {

	public void apply(BufferedImage img) {
		BufferedImage img2 = (BufferedImage) img.clone();
		
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
