import java.util.*;

class GivenSumPair{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();

        int arr[] = new int[n];

        //Taking input
        for(int i: arr)
            arr[i]=sc.nextInt();

        //Sum whose values need to be found
        int x = sc.nextInt();

        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();

        for(int i=0;i<n;i++){
            int y = x-arr[i];
            map.put(i+1,y);
        }

        //Now traversing to find other value

        for(int i=0;i<n;i++){
            if(map.containsValue(arr[i])){
                System.out.println("true");
                return;
            }
        }

        System.out.println("false");
        return;
        

    }
}