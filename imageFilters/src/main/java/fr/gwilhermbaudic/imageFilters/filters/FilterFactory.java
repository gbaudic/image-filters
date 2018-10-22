package fr.gwilhermbaudic.imageFilters.filters;

public class FilterFactory {

	public static Filter createFilter(int index){
		switch(index){
		case 1 : return new Grayscale();
		case 2 : return new Blur();
		case 3 : return new Inverter();
		case 4 : return new Sepia();
		case 5 : return new XFlip();
		case 6 : return new YFlip();
		case 0 : return new Identity();
		default : return null;
		}
	}
	
}
