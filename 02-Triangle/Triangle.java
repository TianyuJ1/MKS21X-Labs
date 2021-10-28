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
  		if ((a / b * 100 <= 100.1) && (a / b * 100 >= 99.9)){
  		return true;
  		}else{
  		return false;
  		}
  	}



	public boolean equals(Triangle other){
		if (other == null){
		return false;
		}
		
		boolean vSame = v1.equals(other.v1) && v2.equals(other.v2) && v3.equals(other.v3);	
		return vSame;
		
	}
		
		/*Return "scalene", "isosceles", or "equilateral"
*Make sure to use closeEnough() to determine if two sides are equal because of rounding!
*/
	public String classify(){
		boolean equal1 = closeEnough(v1.distanceTo(v2), v2.distanceTo(v3));
		boolean equal2 = closeEnough(v2.distanceTo(v3), v3.distanceTo(v1));
		boolean equal3 = closeEnough(v3.distanceTo(v1), v1.distanceTo(v2));
		 
		if (equal1 && equal2 && equal3){
			return "equilateral";
		}
		if (equal1 || equal2 || equal3){
			return "isosceles";
		}else{
		return "scalene";
		}
	}
	
	/*Return the area of the triangle
*Make sure to use the formula: Area = sqrt ( s(s-a)(s-b)(s-c) )
*where s= perimeter/2 , and a,b,c are the side lengths.
*/
	public double area(Point v1, Point v2, Point v3){
		double s = getPerimeter() * 0.5 ;
		double a = v1.distanceTo(v2);
		double b = v2.distanceTo(v3);
		double c = v3.distanceTo(v1);
		
	return Math.sqrt( s * ( s - a) * ( s - b) * (s - c));
	}
	
	   public String toString(){
   	return "{" + v1 + ", " + v2 + ", " + v3 + "}";
   	}

}

