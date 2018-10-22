package fr.gwilhermbaudic.imageFilters.IO;

import java.awt.image.BufferedImage;
import java.io.IOException;

import fr.gwilhermbaudic.imageFilters.IO.ESIReader;
import junit.framework.TestCase;

public class ESIReaderTest extends TestCase {

	public void testRead() {
		ESIReader es = new ESIReader();
		try {
			BufferedImage buffy = es.read("examples/cup6x6.esi");
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
