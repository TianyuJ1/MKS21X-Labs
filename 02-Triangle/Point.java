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
   	public static boolean closeEnough(double a, double b){
  //How can you determine if two values are close enough to eachother?
  		if ((a / b * 100 <= 100.001) && (a / b * 100 >= 99.999)){
  		return true;
  		}else{
  		return false;
  		}
  	}
  	/*Return true when the respective x and y values of the two points differ by at most 0.001% each.
*To avoid issues: If one is 0.0, the other must be exactly 0.0.
*/
	public boolean equals(Point other){
		boolean xSame;
		boolean ySame;
		if (other == null){
			return false;
		}
		if (this.getX() == 0 || other.getX() == 0){
		
		if (this.getX() == 0 && other.getX() == 0){
		xSame = true;
		}else{
		xSame = false;
		}}else{
		xSame = closeEnough(this.getX(), other.getX());
		}
		
	
		
		if (this.getY() == 0 || other.getY() == 0){
		
		if (this.getY() == 0 && other.getY() == 0){
		ySame = true;
		}else{
		ySame = false;
		}}else{
		ySame = closeEnough(this.getY(), other.getY());
		}
		
		
		return (xSame && ySame);
		}
		

}

