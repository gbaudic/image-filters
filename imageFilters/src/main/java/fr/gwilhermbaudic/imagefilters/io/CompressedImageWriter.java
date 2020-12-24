package fr.gwilhermbaudic.imagefilters.io;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

/**
 * Writer for JPEG and PNG image formats
 * @author g.baudic
 */
class CompressedImageWriter implements Writer{
	
	/** Selected type for this writer */
	private FileType type;
	
	/**
	 * Constructor
	 * @param type selected type for this Writer
	 */
	CompressedImageWriter(FileType type) {
		super();
		this.type = type;
	}

	@Override
	public void write(String filename, BufferedImage src) throws IOException {
		
		File dest = new File(filename);
		
		switch(type){
		case JPEG : // fallthrough
		case PNG : ImageIO.write(src, type.getExtension(), dest);
			break;
		default: break;
		}
		
	}

}
