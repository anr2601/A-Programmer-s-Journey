import java.util.*;

public class duplicate {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking Input

        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter the values of the array: ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        sc.close();

        System.out.println("Array: ");

        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }

        System.out.println();
        System.out.println("The array has duplicates:"+check(n, nums));

    }

    // Checking for duplicates

    static boolean check(int n, int[] nums) {

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }

}