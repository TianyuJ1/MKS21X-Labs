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
        try{
          File file = new File("data");
          Scanner input = new Scanner(file);
          if(input.hasNextInt() == true){
            int c1 = input.nextInt();
            int c2 = input.nextInt();
            int c3 = input.nextInt();
            int c4 = input.nextInt();
            int c5 = input.nextInt();
            int c6 = input.nextInt();
            int c7 = input.nextInt();
            int c8 = input.nextInt();
            int c9 = input.nextInt();

          if ((c1 + c2) > c3 || (c2 + c3) > c1 || (c1 + c3) > c2)
          && if ((c4 + c5) > c6 || (c4 + c6) > c5 || (c5 + c6) > c4)
          && if ((c7 + c8) > c9 || (c8 + c9) > c7 || (c7 + c9) > c8){
            Valids += 1;
          }else{
            System.out.println("invalid");
          }
        }
      }
      Input.close();
      catch{(FileNotFoundException ex)
        System.out.println("file not found");
    }
    return ValidCs;

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
