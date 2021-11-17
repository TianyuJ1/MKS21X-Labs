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
              if (data[x] != null && data[x+1] != null){
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
          for (int i = 0; i < size; i++){
              toStringDebug += data[i];
              if(i!=size-1){
                toStringDebug += ", ";
              }
          }
          toStringDebug += "]";
          return toStringDebug;
        }

	public boolean remove(String target) {
        if (indexOf(target) == -1) {
            return false;
        }
        else {
            remove(indexOf(target));
            return true;
        }



    public String get(int index) {
      if (index == 0 || index > size) {
        System.out.println("error");
      }

      if (data[index].equals("")) {
        return null;
      }else return data[index];
    }

   public String set(int index, String element){
    if (index == 0 || index > size) {
     System.out.println("error");
     return null;
    }
    if (data[index].equals("")) {
      return null;
    }else{
      String original = data[index];
      data[index]= element;
      return original;
    }
  }

    SuperArray(int initialCapacity) {
      data=new String[initialCapacity];
    }

    private void resize() {
      String[] resizeData = new String[2 *data.length +1];
      for (int x = 0; x < data.length; x++){
        resizeData[x] = data[x];
        }
     data = resizeData;
   }

    public String remove(int index) {
      String removeData = data[index];
        for (int x = data[index]; x < data.length; x++){
          data[x] = data[x + 1];

          return removeData;
}

public void add(int index,String value) {
        //System.out.println(size + " " + data.length);
        if (size() == data.length) {
            resize();
        //    System.out.println("error" /*+ size() + " " + data.length);
        }
        String [] copy = Arrays.copyOfRange(data,index,data.length);
        data[index] = value;
        for (int x = index+1, y=0; x < data.length; x++, y++) {
            data[x] = copy[y];
        }
        size++;
    }

    
    }
}


}
    
