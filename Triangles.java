 import java.io.File;
  import java.io.FileNotFoundException;
  import java.util.Scanner;
  public class ReadFile {
    public static void main(String[] args) {
        try {
            File file = new File("data");
            Scanner input = new Scanner(file);
            while (input.hasNextLine()) {
                String line = input.nextLine();
                System.out.println(line);
            }
            input.close();//releases the file from your program

        } catch (FileNotFoundException ex) {
            System.out.println("file not found");
        }
    }
    public static int ValidTrianles(File data){
      int ValidTs = 0;
      try{
        File file = new File("data.txt");
        Scanner input = new Scanner(file);
        int x = input.nextInt();
        int y = input.nextInt();
        int z = input.nextInt();
       
       if(x + y >= z || x + z >= y || y + z >= x){
          ValidTs ++;
        }
      
      Input.close();
    }catch(FileNotFoundException e){
      System.out.println("file not found");
      }
      return ValidTs;
    }
    
    
        
}
       
        
