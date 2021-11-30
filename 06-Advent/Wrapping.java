import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Wrapping {
	public static void main(String[] args){
	 try{
	  File file = new File("file2");
          Scanner input = new Scanner(file);
          int lineNum = 0;

          while (input.hasNextLine()) {
              String line = input.nextLine();
              System.out.println(lineNum + ":  " + line);
              lineNum++;
          }
          System.out.println(slacks(file));
	 }
	 catch(FileNotFoundException e){
        		System.out.println("file not found");
    		}
	}
		
		public static int slacks(File data){
			int slack = 0;
			
			try {
				
          			File file = new File("file2");
          			Scanner input = new Scanner(file);
          			while (input.hasNextInt()){
          				int max = 0;
          				int length = input.nextInt();
          				int width = input.nextInt();
            				int height = input.nextInt();
            				if (length >= width && length >= height){
            					max = length;
            				}
            				if (height >= width && height >= length){
            					max = height;
            				}
            				if (width >= length && width >= height){
            					max = width;
            				}
            				slack = slack + ((length + width + height - max)*2 + length * width * height);
            			
            	}
            	}
            	catch(FileNotFoundException e){
        		System.out.println("file not found");
    		}
    	return slack;
    	}
    }
