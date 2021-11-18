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
      		if (size() == data.length){
      			resize();
      		}
        	data[size] = s;
        	size ++;
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

	


    	public String get(int index) throws ArrayIndexOutOfBoundsException{
      		if (index < 0 || index > size) {
        		throw new ArrayIndexOutOfBoundsException("I went out of bounds, nothing's here!");
        	}
        	String dataIindex = data[index];
        	for (int i = index; i < size()-1; i ++){
		if (data[index].equals("")) {
        		dataIindex = null;
      		}else dataIindex = data[index];
    		}
    		return dataIindex;
    		
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
        	data = new String[2*data.length+1];
        	for (int i = 0; i < size(); i ++){
        		data[i] = resizing[i];
   		}
   	}
	public int indexOf(String s) {
    		for (int x = 0; x < data.length; x ++) {
            		if (data[x].equals(s)) {
                	return x;
            		}	
        	}
        	return -1;
        }
        
	public int lastIndexOf(String s) {
        	for (int x = data.length-1; x >=0; x --) {
            		if (data[x].equals(s)) {
                	return x;
            	}
        	}
        	return -1;
    	}
   
    	public String remove(int index) throws ArrayIndexOutOfBoundsException{
        	if (index > size()-1 || index < 0) {
            		throw new ArrayIndexOutOfBoundsException("I went out of bounds");
            	}
        	String dataindex = data[index];
            
    		for (int i = index; i < size()-1; i ++){
    			data[i] = data[i+1];
                }
            	
                size--;
        	return dataindex;
    	}
    	
    	public boolean remove(String target) {
        	if (indexOf(target) == -1) {
            		return false;
        	}else {
            		remove(indexOf(target));
            		return true;
        	}
        }
	
    

	

}
    
