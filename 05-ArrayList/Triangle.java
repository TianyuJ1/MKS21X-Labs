import java.io.File;
import java.util.Scanner;
public class Triangles {
    public static void main(String[] args) {
      try {
          File file = new File("data");
          Scanner input = new Scanner(file);

          while (input.hasNextLine()) {
              String line = input.nextLine();
              System.out.println(line);
          }
          input.close();

      } catch (FileNotFoundException ex) {
          //File not found
          System.out.println("file not found");
      }
  }
}
