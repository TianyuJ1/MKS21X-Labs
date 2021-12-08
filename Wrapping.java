import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Wrapping {
	public static void main(String[] args){
	}
		public int slacks(File data){
			int slack = 0;
			try {
          			File file = new File("data");
          			Scanner input = new Scanner(file);
          			for (int i = 0; i < data.length(); i++){
          			int length = input.nextInt();
          			int width = input.nextInt();
            			int height = input.nextInt();
            			slack = ((length * width) + (width * height) + (length * height));
            		System.out.println(slack);
            	}
            	}
            	catch(FileNotFoundException e){
        		System.out.println("file not found");
    		}
    	return slack;
    	}
    }
