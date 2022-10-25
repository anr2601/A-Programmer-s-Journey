import java.util.*;

public class setmatrixzero {

    static void setZeroes(int[][] arr, int x, int y) {

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows: ");
        int i = sc.nextInt();

        System.out.println("Enter the number of columns: ");
        int j = sc.nextInt();

        int arr[][] = new int[i][j];

        System.out.println("Enter values for the matrix: ");
        for (int x = 0; x < i; x++) {
            for (int y = 0; y < j; y++) {
                arr[x][y] = sc.nextInt();
            }
        }

        System.out.println(); 

        for (int x = 0; x < i; x++) {
            for (int y = 0; y < j; y++) {
                System.out.print(arr[x][y] + " ");
            }
            System.out.println();
        }

        int temp[][] = new int[i][j];

        for(int x=0;x<i;x++){
            for(int y=0;y<j;y++){
                temp[x][y] = 1;
            }
        }

        System.out.println();

        for (int x = 0; x < i; x++) {
            for (int y = 0; y < j; y++) {

                if (arr[x][y] == 0) {

                    for (int k = 0; k < i; k++)
                    {
                        temp[k][y] = 0;
                    }

                    for (int k = 0; k < j; k++) 
                    {
                        temp[x][k] = 0;
                    }

                }

            }
        }
        for (int x = 0; x < i; x++) {
            for (int y = 0; y < j; y++) {
                arr[x][y] = temp[x][y];
            }
        }

        for (int x = 0; x < i; x++) {
            for (int y = 0; y < j; y++) {
                System.out.print(arr[x][y]+" ");
            }
            System.out.println();
        }


        sc.close();
    }
}
