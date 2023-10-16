import java.util.*;

public class arrleaders {
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        ArrayList<Integer> leader = leaders(arr);

        for(int el:arr){
            System.out.print(el+" ");
        }
    }

    public static ArrayList<Integer> leaders(int[] arr){
        ArrayList<Integer> ans = new ArrayList<>();

        int max = arr[arr.length-1];
        ans.add(max);

        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]>max){
                max = arr[i];
                ans.add(max);
            }
        }

        return ans;
    }
}
