package fr.gwilhermbaudic.imageFilters.IO;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

class CompressedImageWriter implements Writer{
	
	private FileType type;
	
	CompressedImageWriter(FileType type) {
		super();
		this.type = type;
	}

	public void write(String filename, BufferedImage src) throws IOException {
		
		File dest = new File(filename);
		
		switch(type){
		case JPEG : ImageIO.write(src, "jpg", dest);
			break;
		case PNG : ImageIO.write(src, "png", dest);
			break;
		default: break;
		}
		
	}

}
