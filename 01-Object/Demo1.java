public class Demo1{
  /* more methods can go here*/

  public static void main(String[]args){
    Point P1 = new Point(1,1);
    Point P2 = new Point(4,5);

    System.out.println(  distance(P1,P2)); //call1
    System.out.println(  Point.distance(P1,P2)); //call 2
    System.out.println(  P1.distanceTo(P2)); //call 3
    //This one is IMPLIED strongly. You cannot tell by the calling style alone,
    //but you can make an educated guess.
    
   
  }
  
    public static double distance(Point P1, Point P2){
  	double dx = P2.getX() - P1.getX();
  	double dy = P2.getY() - P1.getY();
  	return Math.sqrt (dx*dx + dy*dy);
  	}
 }
