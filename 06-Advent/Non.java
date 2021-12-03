import java.util.ArrayList;
import java.util.Collections;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.*;
public class Non
{
    public static void main(String[] args)throws FileNotFoundException{
    	try{
    		File file = new File("dataSet2");
    		System.out.println(NiceString(file));
    	}catch(FileNotFoundException ex){
    		System.out.println("File not found");
    	}
    }

   public static int NiceString(File data)throws FileNotFoundException{

        Scanner input = new Scanner(data);
        int counter = 0;
        while (input.hasNext()){
     	    int vowels = 0;
     	    int repeats = 0;
     	    int found = 0;
        //try every pair of letter   
        String n = input.next();
        for (int j = 0; j < n.length(); j ++){
        	if (n.charimport java.util.ArrayList;
import java.util.Collections;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.*;
public class Non
{
    public static void main(String[] args)throws FileNotFoundException{
    	try{
    		File file = new File("dataSet2");
    		System.out.println(NiceString(file));
    	}catch(FileNotFoundException ex){
    		System.out.println("File not found");
    	}
    }

   public static int NiceString(File data)throws FileNotFoundException{

        Scanner input = new Scanner(data);
        int counter = 0;
        while (input.hasNext()){
     	    int vowels = 0;
     	    int repeats = 0;
     	    int found = 0;
        //try every pair of letter   
        String n = input.next();
        for (int j = 0; j < n.length(); j ++){
        	if (n.charAt(j) == 'a'||n.charAt(j) == 'e' ||n.charAt(j) == 'i'||n.charAt(j) == 'o'||n.charAt(j) == 'u'){
         		vowels += 1;
		}
	for (int k = 0; k < n.length()-1; k ++){
		if (n.charAt(k) == n.charAt(k+1)){
		repeats = 1;
		}
	}
	for (int h = 0; h < n.length()-1; h++){
		if(n.substring(h, h + 2).equals("ab") || n.substring(h, h + 2).equals("cd") || n.substring(h, h + 2).equals("pq") || n.substring(h, h + 2).equals("xy")){
		found = 1;
		}
	}
	}
	if((vowels >= 3) && (repeats == 1) && (found == 0)){
  		counter++;

  	
  


  }
  }
  input.close();
 return counter;
 
 }
 }At(j) == 'a'||n.charAt(j) == 'e' ||n.charAt(j) == 'i'||n.charAt(j) == 'o'||n.charAt(j) == 'u'){
         		vowels += 1;
		}
	for (int k = 0; k < n.length()-1; k ++){
		if (n.charAt(k) == n.charAt(k+1)){
		repeats = 1;
		}
	}
	for (int h = 0; h < n.length()-1; h++){
		if(n.substring(h, h + 2).equals("ab") || n.substring(h, h + 2).equals("cd") || n.substring(h, h + 2).equals("pq") || n.substring(h, h + 2).equals("xy")){
		found = 1;
		}
	}
	}
	if((vowels >= 3) && (repeats == 1) && (found == 0)){
  		counter++;

  	
  


  }
  }
  input.close();
 return counter;
 
 }
 }     
