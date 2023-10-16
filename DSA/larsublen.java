import java.util.*;

public class larsublen {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(maxlen(arr));
        sc.close();
    }

    public static int maxlen(int[] nums){

        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int max = 0;

        for(int i=0;i<nums.length;i++){
            
            sum+=nums[i];
            
            if(sum==0) max=i+1;
            
            else if(map.get(sum)!=null) max = Math.max(max, i-map.get(sum));
            
            else map.put(sum, i);
            
        }
        return max;
    }
}
