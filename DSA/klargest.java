
// Print the kth largest element in an array


import java.util.*;

public class klargest{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int n=sc.nextInt();

        System.out.println("Enter the values in the array :");

        int arr[]=new int[n];

        for(int i=0;i<n;i++){

            arr[i]=sc.nextInt();

        }

        System.out.println("Enter the value of k: ");

        int k=sc.nextInt();

        Arrays.sort(arr);

        if(k==1){
            System.out.println("1st largest element is: ");
        }
        else if(k==2 || k==3){
            System.out.println("The "+k+"rd largest element is: ");
        }
        else{
            System.out.println("The "+k+"th largest element is: ");
        }
        
        int x=n-k;

        System.out.print(arr[x]);


    }
}