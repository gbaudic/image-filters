package fr.gwilhermbaudic.imageFilters.IO;

public class ReaderFactory {
	public static Reader createReader(FileType t){
		switch(t){
		case ESI : return new ESIReader();
		case PNG : //Same as JPEG below
		case JPEG : return new CompressedImageReader();
		default : return null;
		}
	}
}
