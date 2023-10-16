import java.util.*;

public class rotationcount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(binsearch(arr));
        sc.close();
    }

    public static int binsearch(int[] nums){
        
        int low = 0;
        int high = nums.length-1;
        int min = Integer.MAX_VALUE;
        int x = 0;

        while(low<=high){
            
            int mid = (low+high)/2;
            

            if(nums[low]<=nums[mid]){
                if(nums[low]<min) x = low;
                min = Math.min(min, nums[low]);
                low = mid+1;
            }
            else{
                if(min>nums[mid]) x = high;
                min = Math.min(min, nums[mid]);
                high = mid-1;
            }
        }

        return x;

    }
}
