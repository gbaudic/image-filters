package fr.gwilhermbaudic.imagefilters.io;

import java.awt.image.BufferedImage;
import java.io.IOException;

/**
 * Simple interface for file reader implementations
 * @author g.baudic
 */
public interface Reader {
	
	/**
	 * Read a file
	 * @param filename name of the file to use
	 * @return the image data for further processing
	 */
	public BufferedImage read(String filename) throws IOException, IllegalArgumentException;
}
