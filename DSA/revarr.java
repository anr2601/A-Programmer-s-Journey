import java.util.*;

public class revarr{

    public static void main(String[] args){
        
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n=sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the values of the array: ");

        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        System.out.println();
        System.out.println("The array: ");
        for(int i=0; i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println();

        System.out.println("Reversed Array:");
        for(int i=0; i<n/2; i++){
            int x=arr[i];
            int y=arr[n-1-i];
            arr[i]=y;
            arr[n-1-i]=x;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

        sc.close();

    }
}