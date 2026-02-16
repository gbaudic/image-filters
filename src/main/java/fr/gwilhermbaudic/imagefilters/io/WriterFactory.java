package fr.gwilhermbaudic.imagefilters.io;

/**
 * Factory for writer classes
 * @author g.baudic
 */
public class WriterFactory {
	
	/**
	 * Factory method for writers
	 * @param t type of file to write
	 * @return a Writer, or null if no suitable one was found
	 */
	public static Writer createWriter(FileType t){
		switch(t){
		case ESI : return new ESIWriter();
		case PNG : //Same as JPEG below
		case JPEG : return new CompressedImageWriter(t);
		default : return null;
		}
	}
}
