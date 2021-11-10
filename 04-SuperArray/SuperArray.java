public class SuperArray  {

  private String[] data;
  private int size;

    public SuperArray() {
  	data = new String[10];
  	size = 0;
  }
    public int size() {
    return size;
  }

    public boolean add(String s){

    for (int x = 0; x <= data.length-1; x++){
      if (data[x] == null) {
      data[x] = s;
      size ++;
      }
   }
    return true;
  }

    public String toString() {
      String toString = "[";
      for (int x = 0; x < size; x++){
        if (data[x] != null && data[x] +1 != null){
          toString += data[x];
          toString += ",";
        }else if (data[x] == null){
      toString += "";
      }
      toString += "]";
      return toString;
    }

    return toString;
    }

    public String toStringDebug() {
      String toStringDebug = "[";
      for (int i = 0; i < data.length; i++){
            toStringDebug += data[i];
            toStringDebug += ", ";
      }
      toStringDebug += "]";
      return toStringDebug;
    }




/*
 private int Debug += data[x];
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

   public String set(int index, String element){
    if (index == 0 || index > size) {
     return null;
    }
    if (data[index].equals(" ")) {
      return null;
    }else{
      String s = data[index];
      data[index]= element;
      return s;
    }

    SuperArray(int initialCapaticy) {
      data = new String[initialCapacity];
    }

    private void resize() {
      String [] resizeData = String[2 * (data.length +1)]
      data = resizeData;
    }

    public String remove(int index) {
      String removeData = data[index];
      dat          if (data[x] == null || data[x] != null){
a[index] = null;
      for (int x = data[index]; x < data.length -1; x++){
        data.[x] = removeData[x]+1;
      return removeData;
      }rivate String[] data

-private int size

      public boolean remove(String target) {
        for (int x = data[index]; x < data.length -1; x++){
          if (data[index]== target){
            remove()
            return true;
          }
        }else{
          return true;
          remove(indexOf(target));
        }
        }
      }


    }*/


}
