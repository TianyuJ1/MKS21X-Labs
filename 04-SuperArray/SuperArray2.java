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
     if (data[x] != null){
       toString += ",";
     }
   }
 }

 public String toStringDebug() {
   String Debug = "[";
   for (int x = 0; x < data.length - 1; x++){
     Debug += data[x];
     Debug += ",";
   }
   Debug += data[SuperArray.length - 1];
   Debug += "]";
   return Debug;
 }

 public String get(int index) {
   if (index == 0 || index > size) {
     return "error";
   }

   if (data[index].equals(" ")) {
     return null;
   }else{
     return data.indexOf;
   }

   public String set(){
    if (index == 0 || index > size) {
     return null;
    }
    if (data[index].equals(" ")) {
      return null;
    }else{
      String s = data[index];
      data[index]=
      return s;
    }
  }
}
