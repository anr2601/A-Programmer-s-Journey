import java.util.*;

public class nge {

    public static void main(String args[]){
        int arr[] = {5,7,1,2,6,0};
        int results[] = nextGreaterElements(arr);
        System.out.println(" Next Greater Elements: ");
        for(int i=0;i<results.length;i++){
            System.out.print(results[i]+" ");
        }
    }

    public static int[] nextGreaterElements(int[] arr){
        int n = arr.length;
        int nge[] = new int[n];

        Stack<Integer> st = new Stack<>();
        for(int i=(2*n-1);i>=0;i--){
            while((st.empty()==false) && (st.peek()<arr[i%n])){
                st.pop();
            }
            if(i<n){
                if(st.empty()==false){
                    nge[i] = st.peek();
                }
                else{
                    nge[i] = -1;
                }
            }
            st.push(i%n);
        }
        return nge;
    }
}
