import java.util.*;

 class blstock{

    static int minstock(int stock[], int n){
        return Arrays.stream(stock).min().getAsInt();
    }
    
    static int maxstock(int stock[], int n){
        return Arrays.stream(stock).max().getAsInt();
    }

    public static void main(String[] args){

        //Taking input first

        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the number of days: ");
        int n= sc.nextInt();
        
        int stock[] = new int[n];
        System.out.println("Enter the price of stock for each day in order: ");
        
        for(int i=0;i<n;i++){
            stock[i]=sc.nextInt();
        }

        //Finding the maximum profit

        //First find the best day to buy the stock, i.e index with the lowest value

        int min = minstock(stock, n);
        for(int i=0;i<n;i++){
            if(min==stock[i]){
                System.out.println("Best day to buy the stock: "+(i+1));  
            }
        }
       

        
        //Now find the best day to sell the stock, i.e the index with the highest value
        int max=maxstock(stock, stock.length);

        for(int i=0;i<n;i++){
            if(max==stock[i]){
                System.out.println("Best day to sell the stock: "+(i+1));
            }
        }
        
        sc.close();

    }
 }
