import java.util.*;

public class countsubxor {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        System.out.println(countxor(arr));
        sc.close();
    }

    public static int countxor(int[] nums, int k){
        HashMap<Integer,Integer> map = new HashMap<>();
        int xor = nums[0];
        int c = 0;
        for(int i=0;i<nums.length-1;i++){
            xor = xor ^ nums[i+1];
            if(xor==k){
                c+=1;
            }
        }
    }
}
