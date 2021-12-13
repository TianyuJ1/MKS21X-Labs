import java.lang.reflect.Array;
import java.util.Arrays;

public class Sorts{
   public static void main(String[] args) {
        int[] data = {1,2,1,3,5,2};
        System.out.println(test("bubble",data));
        data = new int[]{1, 2, 1, 3, 5, 2};
        System.out.println(test("selection",data));
        data = new int[]{1, 2, 1, 3, 5, 2};
        System.out.println(test("inserction",data));
    }

    /**Bubble sort of an int array.
     *Upon completion, the elements of the array will be in increasing order.
     *@param data  the elements to be sorted.
     */
    public static void bubbleSort(int[] data){
        for(int i=0;i<data.length-1;i++){//外层循环控制排序趟数
            for(int j=0;j<data.length-1-i;j++){//内层循环控制每一趟排序多少次
                if(data[j]>data[j+1]){
                    int temp=data[j];
                    data[j]=data[j+1];
                    data[j+1]=temp;
                }
            }
        }
    }
    /*Selection sort
     */
    public static void selectionSort(int [] ary) {
        /*Your implementation here!*/
        for (int i = 0; i < ary.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < ary.length; j++) {
                if (ary[minIndex] > ary[j]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = ary[i];
                ary[i] = ary[minIndex];
                ary[minIndex] = temp;
            }
         }
     }

    public static void insertionSort(int[] data){
        int i, j;
        int n = data.length;
        int target;
        for (i = 1; i < n; i++)
        {
            j = i;
            target = data[i];
            while (j > 0 && target < data[j - 1])
            {
                data[j] = data[j - 1];
                j--;
            }
            data[j] = target;
        }
    }

    public static boolean test(String method, int[] data) {
        int[] copy = Arrays.copyOf(data, data.length);
        if (method.equals("bubble")) {
            //if it works this is for timing purposes.
            bubbleSort(data);
        } else if (method.equals("selection")) {
            //if it works this is for timing purposes.
            selectionSort(data);
        } else if (method.equals("inserction")) {
            //if it works this is for timing purposes.
            insertionSort(data);
        }
        Arrays.sort(copy);
        if (Arrays.equals(copy, data)) {
            return true;
        }
        return false;
    }

   

}

