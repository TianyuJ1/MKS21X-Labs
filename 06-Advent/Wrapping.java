import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Wrapping {
public static void main(String[] args){
	try{
	 File file = new File(args[0]);
          Scanner input = new Scanner(file);
          int lineNum = 0;
          while (input.hasNextLine()) {
              String line = input.nextLine();
             // System.out.println(lineNum + ":  " + line);
              lineNum++;
          }
          int mode = Integer.parseInt(args[1]);
          if (mode == 1){
          	System.out.println(wrapPaper(args[0]));
          }
          if (mode == 2){
          	System.out.println(slacks(args[0]));
          }
 }
catch(FileNotFoundException e){
        System.out.println("file not found");
    }
   }

public static int wrapPaper(String data){
int WrapPaper = 0;

try {

          File file = new File(data);
          Scanner input = new Scanner(file);
          while (input.hasNextLine()){
          String line = input.nextLine();
          Scanner s = new Scanner(line);
          int firstX = line.indexOf("x");
          int secondX = line.lastIndexOf("x");

          String lengthString = line.substring(0, firstX);
          int length = Integer.parseInt(lengthString);

          String widthString = line.substring(firstX +1, secondX);
          int width = Integer.parseInt(widthString);

          String heightString = line.substring(secondX +1, line.length());
          int height = Integer.parseInt(heightString);

          int min = Math.min(length * width, Math.min(width * height, height * length));

           WrapPaper += ((2 * length * height) + (2 * length * width) + (2 * height * width) + min);}
} catch(FileNotFoundException e){
        System.out.println("file not found");
    }
    return WrapPaper;
    }


public static int slacks(String data){
int slack = 0;

try {
        File file = new File(data);
          Scanner input = new Scanner(file);
          while (input.hasNextLine()){
          String line = input.nextLine();
          Scanner s = new Scanner(line);
          int firstX = line.indexOf("x");
          int secondX = line.lastIndexOf("x");

          String lengthString = line.substring(0, firstX);
          int length = Integer.parseInt(lengthString);

          String widthString = line.substring(firstX +1, secondX);
          int width = Integer.parseInt(widthString);

          String heightString = line.substring(secondX +1, line.length());
          int height = Integer.parseInt(heightString);

          int max = 0;
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
