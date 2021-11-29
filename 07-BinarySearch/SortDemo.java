// Importing Arrays class from the utility class
import java.util.Arrays;

public class SortDemo{
    public static void main(String[] args)
    {
        // Custom input array, but you can make it randomly
        int[] arr = { 13, 7, 6, 45, 21, 9, 101, 102 };

        System.out.println(Arrays.toString(arr));
        //Arrays.sort() changes the array, no return value
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
