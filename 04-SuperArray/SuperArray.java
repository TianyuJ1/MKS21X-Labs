public class SuperArray {
    private String[] data;
    private int size;
    private static int DEFAULT_CAPACITY = 10;

    public SuperArray() {
        this.data = new String[DEFAULT_CAPACITY];
    }
    public SuperArray(int initialCapacity){
        if(initialCapacity <= 0){
            throw new IllegalArgumentException("Capcacity < 0"+ initialCapacity);
        }
        data = new String[initialCapacity];
        size = 0;
    }

    public boolean add(String element){
        if(size == data.length){
            resize(data.length * 2 + 1);
        }
        for(int i = size;i >size;i--){
            data[i] = data[i - 1];
        }
        data[size] = element;
        size++;
        return true;
    }
    public int size() {
        return size;
    }
    public boolean isEmpty(){
        return size == 0;
    }
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        if(isEmpty()){
            sb.append(']');
        }
        else{
            for(int i = 0;i < size;i++){
                sb.append(data[i]);
                if(i != size - 1){
                    sb.append(',');
                }
                else{
                    sb.append(']');
                }
            }
        }
        return sb.toString();
    }
    public String toStringDebug(){
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for(int i = 0;i < data.length;i++){
            sb.append(data[i]);
            if(i != data.length - 1){
                sb.append(',');
            }
        }
        sb.append(']');
        return sb.toString();
    }
    public String get(int index){
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException("Index out of range: "+index);
        }
        return data[index];
    }
    public String set(int index,String element){
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException("Index out of range: "+index);
        }
        String res = data[index];
        data[index] = element;
        return res;
    }

    private void resize(int newLength) {
        String[] newData = new String[newLength];
        for(int i = 0;i < size;i++){
            newData[i] = data[i];
        }
        data = newData;
    }
    public int indexOf(String element){
        for(int i = 0;i < size;i++){
            if(data[i].equals(element)){
                return i;
            }
        }
        return -1;
    }
    public int lastIndexOf(String element){
        if (size == 0) return -1;
        for(int i = size-1;i >= 0;i--){
            if(data[i].equals(element)){
                return i;
            }
        }
        return -1;
    }

    public void add(int index,String value){
        if(index < 0 || index > size){
            throw new IndexOutOfBoundsException("Index out of range: "+index);
        }
        if(size == data.length){
            resize(data.length * 2 + 1);
        }
        for(int i = size;i >index;i--){
            data[i] = data[i - 1];
        }
        data[index] = value;
        size++;
    }
    public String remove(int index){
        if(index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of range: "+index);
        }
        String res = data[index];
        for(int i = index;i <= size - 2;i++){
            data[i] = data[i + 1];
        }
        size--;
        return res;
    }
    public boolean remove(String element){
        int index = 0;
        while((index = indexOf(element)) != -1) {
            remove(index);
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        SuperArray alist = new SuperArray();
        alist.add("a");

        System.out.println(alist);
        System.out.println(alist.toStringDebug());

        alist.add("b");

        System.out.println(alist);
        System.out.println(alist.toStringDebug());

        alist.add("Ash");
        alist.add("c");
        alist.add("d");

        System.out.println(alist);
        System.out.println(alist.toStringDebug());
    }
}
