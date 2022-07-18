
/*
You are given a read only array of n integers from 1 to n.

Each integer appears exactly once except A which appears twice and B which is missing.

Return A and B.

 */


 import java.util.*;

public class misrep{
    public static void main(String[] args){
    int arr[]=new int[5];
    arr[0]=1;
    arr[1]=2;
    arr[2]=4;
    arr[3]=5;
    arr[4]=1;

    Arrays.sort(arr);

    for(int i=0;i<5;i++){
        if(arr[i]==arr[i+1]){
            System.out.println("Repeating Number: "+ arr[i]);
                break;
        }
        
        }

    for(int i=1;i<(4);i++){
        int x=arr[i+1]-1;
        if(arr[i]!=x){
            System.out.print("Missing Number: "+ x);
            break;
        }
    }


}
}