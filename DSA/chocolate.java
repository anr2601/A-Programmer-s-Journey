import java.util.*;

public class chocolate{

    public static void main(String[] args){

        //Taking Input

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of packets: ");
        int n= sc.nextInt();
        int[] arr=new int[n];

        System.out.println("Enter the sizes of each packet of chocolates: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        sc.close();

        System.out.println("Chocolate packets and their sizes: ");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
        }

        System.out.println("No. of students: ");
        int m=sc.nextInt();

        System.out.println("The ideal distribution of chocolates would be: "+distribution(n, arr, m));

    }

    static int distribution(int n, int arr[], int m){
        
        System.out.println("Sorted array: ");
        Arrays.sort(arr);

        if(n<m){
            return -1;
        }

        int min = Integer.MAX_VALUE;

        for (int i = 0; i + m - 1 < n; i++)
        {
            int diff = arr[i+m-1] - arr[i];
            if (diff < min)
                min = diff;
        }
        return min;

    }
}