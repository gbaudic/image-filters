package fr.gwilhermbaudic.imagefilters.io;

/**
 * Factory for Reader classes
 * @author g.baudic
 */
public class ReaderFactory {
	
	/**
	 * Factory method for readers
	 * @param t file type to read
	 * @return a suitable Reader, or null if none exists
	 */
	public static Reader createReader(FileType t){
		switch(t){
		case ESI : return new ESIReader();
		case PNG : //Same as JPEG below
		case JPEG : return new CompressedImageReader();
		default : return null;
		}
	}
}
