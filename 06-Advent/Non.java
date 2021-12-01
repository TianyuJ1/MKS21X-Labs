import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Non {
    public static void main(String[] args){
      try {
          File file = new File("data set2");
          Scanner input = new Scanner(file);
          int lineNum = 0;

          while (input.hasNextLine()) {
              String line = input.nextLine();
              System.out.println(lineNum + ":  " + line);
              lineNum++;
          }
        
          
          input.close();

       } catch (FileNotFoundException ex){ 
          System.out.println("file not found");
      	}
      }

      public static String NiceString(File data){
        String vowelLetter = new[] { 'a', 'e', 'i', 'o', 'u' };
        String naughtyLetter = new[] {'ab', 'cd','pq','xy'}
        int vowel = 0;
        int repeat = 0;
        int naughty = 0;
