package fr.gwilhermbaudic.imageFilters.filters;

import java.awt.image.BufferedImage;

/**
 * A dummy filter which does absolutely nothing
 * Useful when the user simply wants an easy way to convert between formats without modification
 * @author g.baudic
 *
 */
class Identity implements Filter {

	public void apply(BufferedImage img) {
		//Do nothing
	}

}
