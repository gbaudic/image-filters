package fr.gwilhermbaudic.imagefilters.io;

/**
 * Define available file types for input and output in Instagram
 * @author g.baudic
 */
public enum FileType {
	
	ESI("esi"), JPEG("jpg"), PNG("png");
	
	/** Associated extension */
	private String extension;

	/**
	 * Constructor
	 * @param string extension to use
	 */
	FileType(String string) {
		extension = string;
	}

	/**
	 * Getter for extension
	 * @return the extension
	 */
	public String getExtension() {
		return extension;
	}
}
