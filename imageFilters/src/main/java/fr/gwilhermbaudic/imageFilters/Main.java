package fr.gwilhermbaudic.imageFilters;

import java.awt.image.BufferedImage;
import java.io.IOException;

import fr.gwilhermbaudic.imageFilters.filters.Filter;
import fr.gwilhermbaudic.imageFilters.filters.FilterFactory;
import fr.gwilhermbaudic.imageFilters.IO.FileType;
import fr.gwilhermbaudic.imageFilters.IO.Reader;
import fr.gwilhermbaudic.imageFilters.IO.ReaderFactory;
import fr.gwilhermbaudic.imageFilters.IO.Writer;
import fr.gwilhermbaudic.imageFilters.IO.WriterFactory;


public class Main {

	public static void main(String[] args) {
		//Check number of arguments
		if(args.length < 5){
			Main.usage();
			return;
		}
		
		String [] filters = new String[args.length - 4];
		System.arraycopy(args, 4, filters, 0, args.length - 4);
		
		BufferedImage src = null;
		
		//Open file (at least, try to)
		try {
			Reader r = ReaderFactory.createReader(FileType.valueOf(args[1]));
			src = r.read(args[0]);
		} catch (IOException e) {
			System.out.println("Error while trying to access file "+e.getMessage());
			return;
		} catch (IllegalArgumentException e) {
			System.out.println("Error while trying to load file "+e.getMessage());
			return;
		} catch (NullPointerException e) {
			System.out.println("Unknown specified file type. Cannot read the file.");
			return;
		}
		
		//Create and apply filter(s)
		if(src != null){ //Do not try to apply filters if image loading failed
			try{
				for(String s : filters){
					Filter f = FilterFactory.createFilter(Integer.parseInt(s));
					f.apply(src);
				}
			} catch(NullPointerException e){
				System.out.println("Unknown filter number. Indexes lie between 0 and 6.");
				return;
			}
		} else {
			System.out.println("Image data could not be imported.");
			return;
		}
		
		//Write result (at least, try to)
		try {
			Writer w = WriterFactory.createWriter(FileType.valueOf(args[3]));
			w.write(args[2], src);
		} catch (IOException e) {
			System.out.println("Error while trying to write file "+e.getMessage());
			return;
		} catch (NullPointerException e) {
			System.out.println("Unknown specified file type. Cannot write the file.");
			return;
		}
		
		//Optional: display result
		DisplayWindow resultView = new DisplayWindow(src);
	}
	
	/**
	 * Prints usage information in case the user enters bad input
	 */
	private static void usage(){
		System.out.println("Usage: input_file input_type output_file output_type filter1 filter2 ...");
		System.out.println("Supported file types are: ESI, JPEG and PNG");
	}

}
