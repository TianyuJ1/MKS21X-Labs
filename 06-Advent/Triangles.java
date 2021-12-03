import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Triangles {
    public static void main(String[] args){
      try {
          File file = new File("data");
          Scanner input = new Scanner(file);
          int lineNum = 0;

          while (input.hasNextLine()) {
              String line = input.nextLine();
              System.out.println(lineNum + ":  " + line);
              lineNum++;
          }
          System.out.println("Valid Triangles: " + ValidTriangles(file));
          System.out.println("Valid columns: " + ValidColumns(file));
          input.close();

       } catch (FileNotFoundException ex){ 
          //File not found
          System.out.println("file not found");
      	}
      }
      
      public static int ValidTriangles(File data){
        int ValidTs = 0;
        
        try{
          File file = new File("data");
          Scanner input = new Scanner(file);
          while (input.hasNextInt()){
            int x = input.nextInt();
            int y = input.nextInt();
            int z = input.nextInt();

          if ((x + y) > z && (x + z) > y && (y + z) > x){
            ValidTs += 1;
       
          }
        }
      
      input.close();
      } catch(FileNotFoundException e){
        System.out.println("file not found");
    }
    return ValidTs;
      }


      public static int ValidColumns(File data){
        int ValidColumn = 0;
        try{
          File file = new File("data");
          Scanner input = new Scanner(file);
          for (int i =0; i < data.length(); i ++){
          while(input.hasNextInt()){
            int c1 = input.nextInt();
            int c2 = input.nextInt();
            int c3 = input.nextInt();
            int c4 = input.nextInt();
            int c5 = input.nextInt();
            int c6 = input.nextInt();
            int c7 = input.nextInt();
            int c8 = input.nextInt();
            int c9 = input.nextInt();

            if ((c1 + c4) > c7 && (c1 + c7) > c4 && (c4 + c7) > c1){
            		ValidColumn += 1;	
          	}
            if ((c2 + c5) > c8 && (c2 + c8) > c5 && (c5 + c8) > c2){
            		ValidColumn += 1;	
          	}
            if ((c3 + c6) > c9 && (c3 + c9) > c6 && (c6 + c9) > c3){
            		ValidColumn += 1;	
          	}
          	
      	 }
      }
      input.close()
      } catch(FileNotFoundException ex){
        System.out.println("file not found");
    }
    return ValidColumn;
    /*System.out.println(ValidColumn);*/
    }

        /*
        for (int = 0; i < data.size(); i ++){
          if (a + b > z || a + c > b || b + c > a){
            ValidTs += 1;
          }else{
            System.out.println("invalid");
          }
        }*/
      }
      


      

  

