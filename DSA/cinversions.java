import java.util.*;

public class cinversions {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        mergeSort(0, arr.length-1, arr);
    }

    public static void mergeSort(int low, int high, int[] arr){

        if(low>=high) return;
        int mid = (low+high)/2;
        mergeSort(low,mid, arr);
        mergeSort(mid+1,high,arr);
        merge(low,mid, high,arr);

    }

    public static int merge(int low,int mid, int high, int[] arr){
        ArrayList<Integer> temp = new ArrayList<>();
        int c = 0;
        int left = low;
        int right = mid+1;

        while(left<=mid && right<=high){
            if(arr[left]<arr[mid]){
                temp.add(arr[left]);
                left++;
            }
            else{
                temp.add(arr[right]);
                c++;
                right++;
            }
        }

        while(left<=mid){
            temp.add(arr[left]);
            left++;
        }

        while(right<=high){
            temp.add(arr[right]);
            right++;
        }

        for(int i=low;i<=high;i++){
            arr[i] = temp.get(i-low);
        }

        return c;
    }
}
