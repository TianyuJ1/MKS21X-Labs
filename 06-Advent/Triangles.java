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
      public int ValidTriangles(int x, int y, int z){
        side1 = x;
        side2 = y;
        side3 = z;
      }

  }
}
