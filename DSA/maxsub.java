import java.util.*;

public class maxsub {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int max = maxsubarray(arr);

        System.out.println(max);
        sc.close();
    }

    public static int maxsubarray(int[] arr){

        int sum = Integer.MIN_VALUE;
        int maxi = 0;
        int start = 0;
        int starti = -1;
        int end = -1;

        for(int i=0;i<arr.length;i++){
            
            if(sum==0) start = i;

            sum+=arr[i];

            if(sum>maxi){
                maxi = sum;
                starti = start;
                end = i;
            }
            


            if(sum<0){
                sum = 0;
            }

        }

        for(int i = starti;i<=end;i++){
            System.out.print(arr[i]+" ");
        }

        return maxi;
    }
}