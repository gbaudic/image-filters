package fr.gwilhermbaudic.imageFilters.IO;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

class CompressedImageReader implements Reader{

	public BufferedImage read(String filename) throws IOException, IllegalArgumentException{
		File src = new File(filename); // open both JPEG and PNG
		BufferedImage img = ImageIO.read(src);
		return img;
	}

}
