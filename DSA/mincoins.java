import java.util.*;

public class mincoins {
    public static void main(String[] args) {
        int V = 49;
        ArrayList<Integer> al = new ArrayList<>();
        int coins[] = {1, 2, 5, 10, 20, 50, 100, 200, 500, 1000};
        int n = coins.length;
        for(int i = n-1;i>0;i--){
            while(V>=coins[i]){
                V -= coins[i];
                al.add(coins[i]);
            }
        }

        System.out.println("The minimum number of coins is: "+al.size());
        System.out.println("Coin Distribution: ");
        for(int i=0;i<al.size();i++){
            System.out.print(al.get(i)+" ");
        }
    }
}
