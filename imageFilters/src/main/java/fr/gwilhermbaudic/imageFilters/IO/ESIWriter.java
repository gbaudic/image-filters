package fr.gwilhermbaudic.imageFilters.IO;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

class ESIWriter implements Writer{

	public void write(String filename, BufferedImage src) throws IOException, FileNotFoundException{
		
		PrintWriter pw = new PrintWriter(filename);
		
		//Frist line: dimensions
		int cols = src.getWidth();
		int lines = src.getHeight();
		pw.println(cols+" "+lines);
		
		//Subsequent lines: data!
		for (int y = 0 ; y < lines ; y++) {
			for (int x = 0 ; x < cols ; x++) {
				// Get color channels of the pixel located at x,y.
				Color c = new Color(src.getRGB(x, y));
				int red = c.getRed();
				int green = c.getGreen();
				int blue = c.getBlue();
				
				//Write the pixel data
				pw.print(red+" "+green+" "+blue+" ");
			}
			//End line and flush the toil... hem, buffer
			pw.println();
			pw.flush();
		}
		
		pw.close();
		
	}

}
