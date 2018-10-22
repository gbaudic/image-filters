package fr.gwilhermbaudic.imageFilters.IO;

import java.awt.image.BufferedImage;
import java.io.IOException;

public interface Reader {
	public BufferedImage read(String filename) throws IOException, IllegalArgumentException;
}
