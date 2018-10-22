package fr.gwilhermbaudic.imageFilters.IO;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

class ESIReader implements Reader{

	public BufferedImage read(String filename) throws IOException, IllegalArgumentException{

		//Copypasta
		FileInputStream fis = new FileInputStream(filename);
		Scanner s = new Scanner(fis);
		int cols = s.nextInt(); //width
		int lines = s.nextInt(); //height

		//Create the empty image
		BufferedImage result = new BufferedImage(cols, lines, BufferedImage.TYPE_3BYTE_BGR);

		for (int y = 0 ; y < lines ; y++) {
			for (int x = 0 ; x < cols ; x++) {
				// Get color channels of the pixel located at x,y.
				int red = s.nextInt();
				int green = s.nextInt();
				int blue = s.nextInt();
				// Create corresponding color
				Color color = new Color(red, green, blue);
				// Set the color of the pixel located at x,y in the BufferedImage
				result.setRGB(x, y, color.getRGB());
			}
		}

		s.close();

		return result;
	}

}
