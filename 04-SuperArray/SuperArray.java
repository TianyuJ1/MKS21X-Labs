public class SuperArray  { 
  public SuperArray() {
  }
  private String[] data;
  private int size;
  
  public int size() {
    return size;
  }

  public boolean add(String s){
    for (int x = 0; x < data.length-1; x++){
      if (data[x] != null) {
        return false;
        }else{
        data[x] = s;
        size ++;
        }
        }
        return true;
     
   }
/*
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
     Debrivate String[] data

-private int sizeug += data[x];
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
      data[index] = null;
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

