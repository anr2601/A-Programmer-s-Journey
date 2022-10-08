import java.util.*;

class Josephus{

    static int Jfunction(int n, int k){

        if(n==1){
            return 1;
        }

        return ( (Jfunction(n-1, k) + k-1)%n +1);
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of participants: ");
        int n = sc.nextInt();
        
        System.out.println("Enter skip size: ");
        int k = sc.nextInt();

        int rel = Jfunction(n, k);
        System.out.println(rel);

        sc.close();

    }
    
}