class Driver {
  public static void main(String[] args) {
    System.out.println("Triangle invocation");
    Triangle example = new Triangle(0.0, 0.0, 0.0, 1.0, 1.0, 0.0);
    Triangle example2 = new Triangle(new Point(0.0, 3.0),new Point(3.0, 0.0), new Point(0.0, 0.0));
    System.out.println("Triangle1: " + example);
    System.out.println("Triangle2: " + example2);
    System.out.println("--------------");
    //
    System.out.println("getVertex invocation on Triangle1");
    System.out.println("" + example.getVertex(1) + ", " + example.getVertex(2)+ ", " + example.getVertex(3));
    System.out.println("--------------");
    //
    System.out.println("getPerimeter invocation on Triangle2");
    System.out.println(example2.getPerimeter()); //expected 10.243
    System.out.println(example.getPerimeter()); //expected 3.414
    System.out.println("--------------");
    //
    System.out.println("setVertex invocation on Triangle2");
    System.out.println("Original: " + example2);
    example2.setVertex(1,new Point(1.0, 0.0));
    example2.setVertex(0,new Point(0.0, 0.0));
    example2.setVertex(2,new Point(0.0, 5.0));
    System.out.println("Changed: " + example2);
    System.out.println(example2.getPerimeter()); //expected 11.099
    System.out.println("--------------");
    //
    System.out.println("closeEnough invocation");
    System.out.println(Point.closeEnough(10, 1)); //expected false
    System.out.println(Point.closeEnough(1, 1));  //expected true
    System.out.println(Point.closeEnough(0.99999, 1)); //expected true
    System.out.println(Point.closeEnough(1 , 0.99999)); //expected false
    System.out.println(Point.closeEnough(1 , 0.999999)); //expected true
    System.out.println("--------------");
    //
    System.out.println("Point.equals invocation");
    Point P1 = new Point(0.0,0.0);
    Point P2 = new Point(1.0, 0.0);
    System.out.println(P1.equals(new Point(0.0,0.0))); //expected true
    System.out.println(P1.equals(new Point(5.0,3.0)));  //expected false
    System.out.println(P2.equals(new Point(0.999999,0.0)));//expected true
    System.out.println(P2.equals(new Point(1.0, 0.01))); //expected false
    System.out.println("--------------");
    //
    System.out.println("Triangle.equals invocation");
    System.out.println(example.equals(new Triangle(0.0, 0.0, 0.0, 1.0, 0.999999, 0.0))); //expected true
    System.out.println(example.equals(new Triangle(0.0, 2.0, 0.0, 1.0, 1.0, 0.0))); //expected false
    System.out.println(example2.equals(new Triangle(new Point(0.0, 0.0),new Point(1.0, 0.0), new Point(5.0, 0.0))));//expected true
    System.out.println(example2.equals(new Point(1.0, 0.01))); //expected false
    System.out.println("--------------");
    //
    System.out.println("Triangle.classify invocation");
    System.out.println("Triangle1" + example);
    System.out.println("Triangle2" + example2);
    System.out.println(example.classify()); //expected isosceles
    System.out.println(example2.classify()); //expected scalene
    Triangle example4 = new Triangle(0.0,0.0, 6.0,0.0, 3.0, Math.sqrt(3)*3);
    System.out.println(example4.classify()); //expected equilateral
    System.out.println("--------------");
    //
    System.out.println("Triangle.area invocation");
    System.out.println("Triangle1 Area: " + example.area());
    System.out.println("Triangle2 Area: " + example2.area());
    System.out.println("--------------");
   }
}
