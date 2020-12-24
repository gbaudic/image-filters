package fr.gwilhermbaudic.imagefilters.io;

import java.awt.image.BufferedImage;
import java.io.IOException;

import org.junit.Test;

import junit.framework.Assert;
import junit.framework.TestCase;

public class ESIReaderTest extends TestCase {

	@Test
	public void testRead() {
		ESIReader es = new ESIReader();
		try {
			BufferedImage buffy = es.read("examples/cup6x6.esi");
			Assert.assertEquals(6, buffy.getHeight());
			Assert.assertEquals(6, buffy.getWidth());
		} catch (IllegalArgumentException e) {
			Assert.fail("File should exist. "+e.getLocalizedMessage());
		} catch (IOException e) {
			Assert.fail("Should not happen. "+e.getLocalizedMessage());
		}
	}
}
