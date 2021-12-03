import java.util.Arrays;
public class Sorts{

  /**Bubble sort of an int array.
  *Upon completion, the elements of the array will be in increasing order.
  *@param arr  the elements to be sorted.
  */
  public static void main(String[] args) {

    int[]arr = {0, 0, 0, 10, 0, 5};
    for(int i = 0; i < arr.length; i ++){
    System.out.println(Arrays.bubbleSort(arr) + "");
  }
}

  public static void bubbleSort(int[] data){

    int a = 0;
    int b = 0;
    for (int i = 0; i < data.length; i ++){
      if(data[i-1] > data[i]){
        a = data[i-1];
        b = data[i];
        data[i-1] = b;
        data[i] = a;
      }

    }

  }

}
