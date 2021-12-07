import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Wrapping {
public static void main(String[] args){
/*try{*/
 File file = new File("input.txt");
          Scanner input = new Scanner(file);
          int lineNum = 0;
          while (input.hasNextLine()) {
              String line = input.nextLine();
              System.out.println(lineNum + ":  " + line);
              lineNum++;
          }
          System.out.println(slacks(args[0]));
/* }
catch(FileNotFoundException e){
        System.out.println("file not found");
    }*/
}
public static int wrapPaper(String data){
int WrapPaper = 0;

try {

          File file = new File(data);
          Scanner input = new Scanner(file);
          while (input.hasNextLine()){
          String line = input.nextLine();
          Scanner s = new Scanner(line);
          String firstX = line.indexOf("x");
          String secondX = line.lastIndexOf("x");
          
          String lengthString = line.substring(0, firstX);
          int length = Integer.parseInt(lengthString);
          
          String widthString = line.substring(firstX, secondX);
          int width = Integer.parseInt(widthString);
          
          String heightString = line.substring(secondX, line.lastIndexOf());
          int height = Integer.parseInt(heightString);
          
           WrapPaper = ((2 * length * height) + (2 * length * width) + (2 * height * width));}
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
          String firstX = line.indexOf("x");
          String secondX = line.lastIndexOf("x");
          
          String lengthString = line.substring(0, firstX);
          int length = Integer.parseInt(lengthString);
          
          String widthString = line.substring(firstX, secondX);
          int width = Integer.parseInt(widthString);
          
          String heightString = line.substring(secondX, line.length()-1);
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
