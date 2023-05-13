import java.util.*;

class Job {

    int id, profit, deadline;

    Job(int x, int y, int z) {
        this.id = x;
        this.profit = y;
        this.deadline = z;
    }

}

public class jobseq {
    public int[] jobschedule(Job arr[], int n) {

        Arrays.sort(arr, (a, b) -> (b.profit - a.profit));
        int max = 0;
        int count = 0;
        int profit = 0;

        for (int i = 0; i < arr.length; i++) {
            max = Math.max(arr[i].deadline, max);
        }

        int result[] = new int[max + 1];

        for (int i = 1; i <= max; i++) {
            result[i] = -1;
        }

        for (int i = 0; i < n; i++) {
            for (int j = arr[i].deadline; j > 0; j--) {

                if (result[j] == -1) {
                    result[j] = i;
                    count += 1;
                    profit += arr[i].profit;
                    break;
                }
                
            }
        }

        int[] ans = new int[2];
        ans[0] = count;
        ans[1] = profit;

        return ans;
    }
}

class Main {

    public static void main(String[] args) {
        Job arr[] = new Job[4];
        arr[0] = new Job(1, 4, 20);
        arr[1] = new Job(2, 1, 10);
        arr[2] = new Job(3, 2, 40);
        arr[3] = new Job(4, 2, 30);

        jobseq ob = new jobseq();

        int[] res = ob.jobschedule(arr, 4);

        System.out.println(res[0] + " " + res[1]);

    }

}