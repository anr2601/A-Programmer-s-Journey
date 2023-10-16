import java.util.*;

public class countOccurences {
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        System.out.println(binsearch(arr, x));
        sc.close();
    }

    public static int binsearch(int[] arr, int x){
        int low = 0;
        int high = arr.length-1;
        int start = -1;
        int end = -1;

        while(low<=high){
            int mid=low+(low+high)/2;

            if(arr[mid]==x){
                start = mid;
                high = mid-1;
            }
            else if(arr[mid]<x){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }

        low = 0;
        high = arr.length-1;

        while(low<=high){
            
            int mid=low+(low+high)/2;

            if(arr[mid]==x){
                end = mid;
                low = mid+1;
            }

            else if(arr[mid]<x) low = mid+1;
            
            else
                high = mid-1;
            
        }

        return end-start;
    }
}
