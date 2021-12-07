import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Wrapping {
public static void main(String[] args){
/*try{*/
 /*File file = new File(args[0]);
          Scanner input = new Scanner(file);
          int lineNum = 0;

          while (input.hasNextLine()) {
              String line = input.nextLine();
              System.out.println(lineNum + ":  " + line);
              lineNum++;
          }*/
          System.out.println(slacks(args[0]));
/* }
catch(FileNotFoundException e){
        System.out.println("file not found");
    }*/
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
          String lengthString = line.substring(0, firstX);
          int length = Integer.parseInt(lengthString);
         
         
          int secondX = line.lastIndexOf("x");
          int width = s.nextInt();
            int height = s.nextInt();
          int max = 0;
       
         
            System.out.println(length + " " + width + " " + height);
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
