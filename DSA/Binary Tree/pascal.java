import java.util.*;

public class pascal {
    
    /* 
    public static long ncr(int n, int r){
        long res = 1;

        for(int i = 0; i<r;i++){
            res = res*(n-i);
            res = res/(i+1);
        }

        return res;
    }

    //Variation 2: Pascal's Triangle for a single row
    /* 
    public static void pascal(int n){
        for(int c=1;c<=n;c++){
            System.out.print(ncr(n-1, c-1)+" ");
        }
        System.out.println();
    }
    */

    /* 
    public static void pascal(int n){
        long ans = 1;

        System.out.print(ans+" ");
        for(int i=1;i<n;i++){
            ans = ans*(n-i);
            ans = ans/i;
            System.out.print(ans+" ");
        }
        System.out.println();
    }
    */

    public static void main(String args[]){
        int x = 5;
        pascal(x);
    }

}
