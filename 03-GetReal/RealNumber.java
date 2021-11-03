public class RealNumber{
  private double value;

  public RealNumber(double v){
    value = v;
  }

  /*
  *Return the sum of this and the other
  */
  public double add(RealNumber other){

     //other can be ANY RealNumber, including a RationalNumber

     //or other subclasses of RealNumber (that aren't written yet)
  	double result = this.getValue() + other.getValue();

  	return result;
  }

  /*
  *Return the product of this and the other
  */
  public double multiply(RealNumber other){
  	double result = this.getValue() * other.getValue();
  	return result;
  }

  /*
  *Return the this divided by the other
  */
  public double divide(RealNumber other){
  	double result = this.getValue() / other.getValue();
    return result;
  }

  /*
  *Return the this minus the other
  */
  public double subtract(RealNumber other){
    double result = this.getValue() - other.getValue();
    return result;
  }


  public double getValue(){
    return value;
  }

  private String toString(){
    return ""+value;
  }
  
  public int compareTo(RealNumber other){
 	return (int)(this.getValue().compareTo(other.getValue()));
  }
  
  public boolean equals(RealNumber other){
  	if (this.getValue() == other.getValue()){
  		return true;
  		}else{
  		return false;
  		}
  	}
 }
  	
