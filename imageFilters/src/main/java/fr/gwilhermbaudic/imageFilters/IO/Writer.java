package fr.gwilhermbaudic.imageFilters.IO;

import java.awt.image.BufferedImage;
import java.io.IOException;

public interface Writer {
	public void write(String filename, BufferedImage src) throws IOException;
}
