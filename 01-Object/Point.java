public class Point{
  private double x,y;
  public Point(double X, double Y){
    x=X;
    y=Y;
  }
  public Point(Point p){
    x= p.x;
    y= p.y;
  }
  public double getX(){
    return x;
  }
  public double getY(){
    return y;
    }
    
  public static double distance(Point P1, Point P2){
  	double dx = P2.x - P1.x;
  	double dy = P2.y - P1.y;
  	return Math.sqrt (dx*dx + dy*dy);
  	
  }
  
   public double distanceTo(Point P1){
  	double dx = x - P1.x;
  	double dy = y - P1.y;
  	return Math.sqrt (dx*dx + dy*dy);
  	}
  
   public String toString(){
   	return "(" + x + ", " + y + ")";
   }
}
