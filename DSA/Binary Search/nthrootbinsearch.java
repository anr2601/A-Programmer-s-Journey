import java.util.*;

public class nthrootbinsearch {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[x];
        for(int i=0;i<x;i++){
            arr[i] = i+1;
        }

        System.out.println(root(arr,n));
        sc.close();
    }

    public static int root(int[] arr, int n){
        int low = 0;
        int high = arr.length-1;

        while(low<=high){
            int mid = (low+high)/2;
            if(Math.pow(mid,n)==arr.length)
                return mid;
            
            if(Math.pow(mid,n)<arr.length) low = mid+1;
            else high = mid-1;
            
        }
        return -1;
    }
}
