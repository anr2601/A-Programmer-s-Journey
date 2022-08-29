import java.util.*;
class rainwater{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size of total field: ");
        int n=sc.nextInt();
        System.out.println("Enter the elevation level for each width 1 of the field: ");
        int arr[]=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();    
        }

        System.out.println("Now finding the amount of rainwater that can be trapped...");

        //Now have to solve the main problem

        int count=0;

        for(int i=1;i<n;i++){
            int x=arr[i-1];
            int y=arr[i+1];

            if( (arr[i]<x) && (arr[i]<y)){
                if(x<y){
                    count+=x;
                }
                else{
                    count+=y;
                }

            }
        }
        sc.close();

        

    }
}