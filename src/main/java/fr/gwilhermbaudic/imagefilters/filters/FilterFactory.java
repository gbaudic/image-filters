package fr.gwilhermbaudic.imagefilters.filters;

/**
 * Factory for the different filters available
 * @author g.baudic
 *
 */
public class FilterFactory {

	/**
	 * Create filter object
	 * @param index index for this filter
	 * @return a filter
	 * @throws IllegalArgumentException in case of unknown index
	 */
	public static Filter createFilter(int index){
		switch(index){
		case 1 : return new Grayscale();
		case 2 : return new Blur();
		case 3 : return new Inverter();
		case 4 : return new Sepia();
		case 5 : return new XFlip();
		case 6 : return new YFlip();
		case 0 : return new Identity();
		default : throw new IllegalArgumentException("Unknown filter");
		}
	}

}
