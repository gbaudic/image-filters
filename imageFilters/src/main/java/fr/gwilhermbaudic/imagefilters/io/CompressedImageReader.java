package fr.gwilhermbaudic.imagefilters.io;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

/**
 * Reader for JPEG and PNG image formats
 * It uses native abilities of the Java platform
 * @author g.baudic
 */
class CompressedImageReader implements Reader{

	/**
	 * Read a file
	 * @param filename path to the file to read
	 * @return the image
	 */
	public BufferedImage read(String filename) throws IOException, IllegalArgumentException{
		File src = new File(filename); // open both JPEG and PNG
		BufferedImage img = ImageIO.read(src);
		return img;
	}

}
