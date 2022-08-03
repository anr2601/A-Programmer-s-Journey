import java.util.*;

class sort012{
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int arr[]= new int[N];
        int c0=0,c1=0,c2=0;
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
            if(arr[i]==0){
                c0+=1;
            }
            else if(arr[i]==1){
                c1+=1;
            }
            else if(arr[i]==2){
                c2+=1;
            }
        }

        for(int i=0;i<N;i++){
            System.out.print(arr[i]+" ");
        }


    }
}