public class TesterS{
public static void main(String args[]){
  SuperArray alist = new SuperArray();
  alist.add("Mario");
  //displaying elements
  System.out.println(alist.toString());
  System.out.println(alist.toStringDebug());

  alist.add("Samus");
  //displaying elements
/*  System.out.println(alist);
  System.out.println(alist.toStringDebug());*/

  alist.add("Ash");
  alist.add("Link");
  alist.add("Kirby");
  //displaying elements
  System.out.println(alist);
  System.out.println(alist.toStringDebug());

	/*try{
		alist.remove(11);
	}
	catch(ArrayIndexOutOfBoundsException e){
            	e.printStackTrace();
  		System.exit(1);
        } 
        
        try{
		alist.get(12);
	}
	catch(ArrayIndexOutOfBoundsException g){
            	g.printStackTrace();
  		System.exit(1);
        } 
        
        try{
		alist.set(13, "ostring");
	}
	catch(ArrayIndexOutOfBoundsException n){
            	n.printStackTrace();
  		System.exit(1);
        } */
}
}
