public class Test1{
public static void main(String[] args){

double a = 100.0;
double b = 99.9999;
System.out.println(closeEnough(a, b));

Point P1 = new Point(0,0);
Point P2 = new Point(0,0);
Point P3 = new Point(0,0);
System.out.println(P1.equals(P2));

Triangle t1 = new Triangle(0,0,0,1,1,0);
System.out.println(area(0,0,0,1,1,0));


}


	


	public static boolean closeEnough(double a, double b){
  //How can you determine if two values are close enough to eachother?
  		if ((a / b * 100 <= 105) && (a / b * 100 >= 95)){
  		return true;
  		}else{
  		return false;
  		}
  	}
  }
