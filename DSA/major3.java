import java.util.*;

public class major3 {

    public static List<Integer> major(int[] nums) {

        int cnt1 = 0, cnt2 = 0;
        int el1 = Integer.MIN_VALUE;
        int el2 = Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++){
            
            if(cnt1 == 0 && el2 != nums[i]){
                cnt1 = 1;
                el1 = nums[i];
            }
            else if(cnt2 == 0 && el1 !=nums[i]){
                cnt2 = 1;
                el2 = nums[i];
            }
            else if(el1 == nums[i]){
                cnt1++;
            }
            else if(el2 == nums[i]){
                cnt2++;
            }
            
            else{
                cnt1--;
                cnt2--;
            }
        }

        cnt1 = 0; cnt2 = 0;

        for(int i=0;i<nums.length;i++){
            if(nums[i] == el1) cnt1++;
            else if(nums[i] == el2) cnt2++;
        }
        
        List<Integer> list = new ArrayList<>();
        
        if(cnt1 > (int)(nums.length/3)){
            list.add(el1);
        }
        if(cnt2 > (int)(nums.length/3)){
            list.add(el2);
        }
        
        return list;
}

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        List<Integer> list = major(nums);

        major(nums);
        
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        sc.close();
    }
}
