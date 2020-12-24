package fr.gwilhermbaudic.imagefilters.filters;

import java.awt.image.BufferedImage;

/**
 * Interface for filters
 * @author g.baudic
 */
public interface Filter {
	
	/**
	 * Apply the fltering operation
	 * @param img image to process
	 */
	public void apply(BufferedImage img);
}
