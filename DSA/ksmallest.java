import java.util.*;

public class ksmallest {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();

        int arr[]= new int[n];

        System.out.println("Enter the values of the array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter the value of k: ");
        int k=sc.nextInt();

        Arrays.sort(arr);
 
        if(k==1){
            System.out.println("1st smallest element is: ");
        }
        else if(k==2){
        System.out.println("The "+k+"nd smallest element is: ");
        }
        else if (k==3){
            System.out.println("The "+k+"rd smallest element is: ");
        }
        else{
            System.out.println("The "+k+"th smallest element is: ");
        }

        int x = k-1;

        System.out.println(arr[x]);

        sc.close();
    }
}
