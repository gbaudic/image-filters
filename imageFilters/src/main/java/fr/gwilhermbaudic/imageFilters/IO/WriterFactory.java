package fr.gwilhermbaudic.imageFilters.IO;

public class WriterFactory {
	public static Writer createWriter(FileType t){
		switch(t){
		case ESI : return new ESIWriter();
		case PNG : //Same as JPEG below
		case JPEG : return new CompressedImageWriter(t);
		default : return null;
		}
	}
}
