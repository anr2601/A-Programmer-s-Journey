import java.util.*;

public class duplicate {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking Input

        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the values of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        System.out.println();
        System.out.println("Array: ");

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        System.out.println();

        //Finding the duplicate elements

        Set<Integer> hs = new HashSet<Integer>();
        for(int i=0; i<n;i++){
            int x=hs.size();
            hs.add(arr[i]);
            if(hs.size()==x){
                System.out.println("Duplicate Element is: "+arr[i]);
            }
        }
    
    }
}

