public class Triangle{
	private Point v1, v2, v3;
	
	public Triangle(Point p1, Point p2, Point p3){
		v1 = p1;
		v2 = p2;
		v3 = p3;
	}
	
	public Triangle(double x1, double y1, double x2, double y2, double x3, double y3){
		v1 = new Point (x1, y1);
		v2 = new Point (x2, y2);
		v3 = new Point (x3, y3);
	}
	
	public double getPerimeter(){
		return v1.distanceTo(v2) + v2.distanceTo(v3) + v3.distanceTo(v1);
	}
		
	public Point getVertex(int i){
		if (i == 1){
			return v1;
		}
		if (i == 2){
			return v2;
		}
		if (i == 3){
			return v3;
		}else{
			return null;
		}
	}
	
	public void setVertex(int i, Point j){
		if (i == 1){
			v1 = j;
		}
		if (i == 2){
			 v2 = j;
		}
		if (i == 3){
			v3 = j;
		}
	}
	
	public static boolean closeEnough(double a, double b){
  //How can you determine if two values are close enough to eachother?
  		if (a / b * 100 <= 105) && (a / b * 100 >= 95){
  		return true;
  		}else{
  		return false;
  		}
  	}		
}
	
}


