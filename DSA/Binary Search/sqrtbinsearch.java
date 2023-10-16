import java.util.*;

public class sqrtbinsearch {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = i+1;
        }
        System.out.println(floor(arr));
        sc.close();
    }

    public static int floor(int[] arr){
        int low = 0;
        int high = arr.length-1;
        int x = 0;

        while(low<=high){
            int mid = (low+high)/2;
            if(mid*mid>arr.length){
                high = mid-1;
            }
            else{
                x = mid;
                low = mid+1;
            }
        }

        return x;
    }
}
