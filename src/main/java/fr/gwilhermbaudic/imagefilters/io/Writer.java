package fr.gwilhermbaudic.imagefilters.io;

import java.awt.image.BufferedImage;
import java.io.IOException;

/**
 * Interface for file writing classes
 * @author g.baudic
 *
 */
public interface Writer {
	
	/**
	 * Write the file
	 * @param filename filename (without extension) to use
	 * @param src image data to be written
	 * @throws IOException in case of error
	 */
	public void write(String filename, BufferedImage src) throws IOException;
}
