import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9,10};
        int[] arr2 = operateArr(arr);
        System.out.println(Arrays.toString(arr2));
    }

    public static int[] operateArr(int[] arr) {
        int[] arr2 = new int[5];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                arr[i] = arr[i] + 1;
            }
        }
        System.arraycopy(arr, 3, arr2, 0, 5);
        return arr2;
    }
}