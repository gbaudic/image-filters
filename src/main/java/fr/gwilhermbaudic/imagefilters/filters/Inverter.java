package fr.gwilhermbaudic.imagefilters.filters;

import java.awt.Color;
import java.awt.image.BufferedImage;

/**
 * Color inverter
 * @author g.baudic
 *
 */
class Inverter implements Filter{

	@Override
	public void apply(BufferedImage img) {
		for (int y = 0; y < img.getHeight(); ++y) {
			for (int x = 0; x < img.getWidth(); ++x) {
				// Get color channels of the pixel located at x,y.
				Color color = new Color(img.getRGB(x, y));
				int red = color.getRed();
				int green = color.getGreen();
				int blue = color.getBlue();
				// The following line inverts color channels
				color = new Color(255-red , 255-green, 255-blue);
				// Set the color of the pixel located at x,y.
				img.setRGB(x, y, color.getRGB());
			}
		}
	}

}
