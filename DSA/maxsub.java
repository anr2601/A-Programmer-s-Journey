import java.util.*;

public class maxsub {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array: ");
        int n = sc.nextInt();
        int[] arr= new int[n];
        int[] sum=new int[n];

        System.out.println("Enter values for the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Original Array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        int max_till_now = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int current_max = 0;
            for (int j = i; j < n; j++) {
                current_max+=arr[i];
            }
            if(current_max>max_till_now){
                max_till_now=current_max;
            }
            sum[i]=current_max;
        }
        System.out.println("Sum of largest contiguous subarray:");
        for(int i=0;i<n;i++){
                System.out.print(sum[i]+" ");
            }
    }
}