public class larsub{

    public static void main(String args[]){

        int arr[] = {2,3,5,1,9};
        int k = 10;

        int large = largestsub(arr, k);

        System.out.println("Largest Subarray Length: "+large);
    }

    public static int largestsub(int[] arr, int k){

        /* 

        # Using Hashing

        int sum = 0;
        int maxlen = 0;
        int len = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i<arr.length ; i++){
            
            sum+=arr[i];

            if(sum==k){
                maxlen = Math.max(maxlen, i+1);
            }

            int rem = sum - k;

            if(map.containsKey(rem)){
                len = i-map.get(rem);
                maxlen = Math.max(maxlen, len);
            }

            if(!map.containsKey(sum)){
                map.put(sum, i);
            }

        }

        return maxlen;
        */

        int sum = arr[0];
        int left = 0;
        int right = 0;
        int maxlen = 0;

        while(right<arr.length){

            while(left<=right && sum>k){
                sum -= arr[left];
                left++;
            }

            if(sum == k){
                maxlen = Math.max(maxlen, right-left+1);
            }

            right++;
            if(right<arr.length) sum+=arr[right];
        }

        return maxlen;
    }
}