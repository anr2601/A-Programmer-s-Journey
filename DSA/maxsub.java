import java.util.*;

public class maxsub {

    public static void main(String[] args) {

        //Input

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter values for the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        //Printing the array created

        System.out.println("Original Array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Sum of largest contiguous subarray:"+ max(n, arr));
    }

    static int max(int n, int arr[]) {
        int max_till_now = Integer.MIN_VALUE;
        int current_max = 0;
        for (int i = 0; i < n; i++) {
            current_max += arr[i];
            if (max_till_now < current_max) {
                max_till_now = current_max;
            }
            if (current_max < 0) {
                current_max = 0;
            }
        }
        return max_till_now;
    }
}