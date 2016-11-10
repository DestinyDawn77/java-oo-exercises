package javagram;

import javagram.filters.*;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;
import javagram.Picture;

public class Javagram {
		
	
	
	


	public static void main(String[] args) {

		// Create the base path for images		
		String[] baseParts = {System.getProperty("user.dir"), "images"};
		String dir = String.join(File.separator, baseParts);
		String relPath = null;
		Picture picture = null;
		Scanner in = new Scanner(System.in);
		int filterID = 0;
		Filter filter = null;
		
	
		
		
		// prompt user for image to filter and validate input
		do {
			
			String imagePath = "path not set";
			
			// try to open the file
			try {
				
				System.out.println("Image path (relative to " + dir + "):");
				relPath = in.next();
				
				imagePath = dir + File.separator + relPath;
				
				picture = new Picture(imagePath);
				
			} catch (RuntimeException e) {
				System.out.println("Could not open image: " + imagePath);
			}
			
		} while(picture == null);
		
		do{
			
		try{
			filterID = chooseFilter();
			filter = getFilter(filterID, picture);
			}catch(IllegalArgumentException e){
			System.out.println("Invalid Filter, Try Again");
		}
		}while(filterID<1 || filterID > 3);
		
		
		Picture processed = filter.process();
		// TODO - prompt user for filter and validate input (chooseFilter())
		
				// TODO - pass filter ID int to getFilter, and get an instance of Filter back  (getFilter())
				// based upon the int, returns blueFilter, GreyScale Filter or Inverse Filter
					
				
			
				// filter and display image
				// need to define processed in filter (apply filter)
				processed.show();
				
				System.out.println("Image successfully filtered");
				
				// save image, if desired
				
				System.out.println("Save image to (relative to " + dir + ") (type 'exit' to quit w/o saving):");
				String fileName = in.next();
				
				// TODO - if the user enters the same file name as the input file, confirm that they want to overwrite the original
				if (fileName.equals(relPath)){
					System.out.println("Do you wish to overright the original file?  Type yes or no: ");
					String choice = in.next();
					if(choice.equals("no")){
					fileName = "exit";
					}
				}
				
				if (fileName.equals("exit")) {
					System.out.println("Image not saved");
				} else {
					String absFileName = dir + File.separator + fileName;
					processed.save(absFileName);
					System.out.println("Image saved to " + absFileName);
				}	
				
				// close input scanner
				in.close();
		}
			
			
			// TODO - refactor this method to accept an int parameter, and return an instance of the Filter interface
			// TODO - refactor this method to thrown an exception if the int doesn't correspond to a filter
			

		
	
	private static int chooseFilter(){
		
			Scanner s = new Scanner (System.in);
			
		
				
				// need to return a picture here based upon the filter returned on getFilter()
					System.out.println("Welcome to Javagram! Please Select a Filter");
					System.out.println("1. Blue Filter");
					System.out.println("2. GreyScale Filter");
					System.out.println("3. Inverse Filter");
					
					int selection = s.nextInt();
					
					if (selection < 1 || selection > 3){
						throw new IllegalArgumentException();
					}
					
					
			
			
			
			// put in exception handling
		
			
			
			return selection;
	}
	
	public static Filter getFilter(int ID, Picture p){ // based upon filterID, execute the appropriate class
		if (ID == 1)
		{
			BlueFilter blue = new BlueFilter(p);
			return blue;
		}
		else if (ID == 2)
		{
			GreyScale grey = new GreyScale(p);
			return grey;
		}
		else //if (ID == 3)
		{
			InverseFilter inverse = new InverseFilter(p);
			return inverse;
		}
		//else
			//throw new IllegalArgumentException();
		
	}
		
		
		
}