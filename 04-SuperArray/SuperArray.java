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
        	}else {
            		remove(indexOf(target));
            		return true;
        	}
        }



    	public String get(int index) {
      		if (index == 0 || index > size) {
        		System.out.println("out of range");
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
        	String [] resizing = java.util.Arrays.copyOf(data,data.length);
        	data = new String[data.length+1];
        	data = java.util.Arrays.copyOf(resizing,data.length);
    	
        	
    		 data = resizeData;
   	}

	public int lastIndexOf(String s) {
        	for (int x = data.length-1; x >=0; x --) {
            		if (data[x].equals(s)) {
                	return x;
            	}
        	}
        	return -1;
    	}
   
    	public String remove(int index) {
        	if (index > data.length || index < 0) {
            		System.out.println("error");
        	}
        	String dataindex = data[index];
        	if (index == size()-1) {
            		String[] copy = Arrays.copyOfRange(data, 0, size-2);
            		data = java.util.Arrays.copyOfRange(copy,0,size);
            		size--;
            	return dataindex;
        	}
        	String[] copy = Arrays.copyOfRange(data, index+1, data.length-1);
        	data = java.util.Arrays.copyOfRange(copy,0,data.length-1);
        	size--;
        	return dataindex;
    	}
    	public int indexOf(String s) {
    		for (int x = 0; x < data.length; x ++) {
            		if (data[x].equals(s)) {
                	return x;
            		}	
        	}
        	return -1;
        }
/*
>>>>>>> 5353f33176ad41cc3d00d5fe614a46582ea15199
    public String remove(int index) {
      String removeData = data[index];
        for (int x = data[index]; x < data.length; x++){
          data[x] = data[x + 1];

          return removeData;
}



}
    
