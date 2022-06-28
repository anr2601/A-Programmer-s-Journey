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

        System.out.println("The ideal distribution of chocolates would be: "+distribution(n, arr));

    }

    static int distribution(int n, int arr[]){
        
        System.out.println("Sorted array: ");
        Arrays.sort(arr);

        return n;

    }
}