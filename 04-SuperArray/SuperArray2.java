public class SuperArray2 {
  private int size = 0;
  public SuperArray() {
  }

  public int size {
    return size;
  }

  public boolean add(String s){
    for (int x = 0; x < data.length-1; x++){
      if (data[x] == null) {
        data[x] = s;
        size ++;

        return true;
      }
    }
   return false;
 }

 public String toString() {
   String tostring = "{";
   for (int x = 0; x <= data.length; x++){
       toString =+ ",";
     }
   }
 }

 
}
