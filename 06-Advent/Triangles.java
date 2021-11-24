import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Triangles {
    public static void main(String[] args)/* throws FileNotFoundException*/{
      try {
          File file = new File("data");
          Scanner input = new Scanner(file);
          int lineNum = 0;

          while (input.hasNextLine()) {
              String line = input.nextLine();
              System.out.println(lineNum + ":  " + line);
              lineNum++;
          }
          input.close();

      } catch (FileNotFoundException ex) {
          //File not found
          System.out.println("file not found");
      }

      public static int ValidTriangles(File data){
        int ValidTs = 0;
        try{
          File file = new File("data");
          Scanner input = new Scanner(file);
          if(input.hasNextInt() == true){
            int x = input.nextInt();
            int y = input.nextInt();
            int z = input.nextInt();

          if ((x + y) > z || (x + z) > y || (y + z) > x){
            ValidTs += 1;
          }else{
            System.out.println("invalid");
          }
        }
      }
      Input.close();
      catch{(FileNotFoundException ex)
        System.out.println("file not found");
    }
    return ValidTs;
      }


      public int ValidColumns(File data){
        int ValidCs = 0;

        /*
        for (int = 0; i < data.size(); i ++){
          if (a + b > z || a + c > b || b + c > a){
            ValidTs += 1;
          }else{
            System.out.println("invalid");
          }
        }*/
      }


      }

  }
}
