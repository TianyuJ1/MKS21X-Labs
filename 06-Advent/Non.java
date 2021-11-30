import java.util.ArrayList;
import java.util.Collections;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Non
{
    /*public static void main(String[] args){
      try{
        File file = new File("data set2");
        Scanner input = new Scanner(file);
        int lineLetter = 0;

        while (input.hasNextLine()) {
          String line = input.nextLine();
          System.out.println(lineLetter + ":  " + line);
          lineLetter++;
      }
      input.close();

   } catch (FileNotFoundException ex){
      System.out.println("file not found");
    }
  }*/

  public String NiceString(File data){

    try{
      File file = new File("data set2");
      Scanner input = new Scanner(file);
      int vowels = 0;
      String line = input.nextLine();
      for (int i = 0; i < data.length(); i ++){
        if(input.hasNextInt() == true){
        int n = input.nextInt();
        if (charAt(n).equals("a")){}
         vowels += 1;

        if (vowels >= 3){
          System.out.println(line);
        }

        }else{
        System.out.println("naughty");
      }
    }

  input.close();
  } catch(FileNotFoundException e){
    System.out.println("file not found");
}

  }
    }
