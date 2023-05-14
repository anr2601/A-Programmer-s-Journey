import java.util.*;

class Item {
    int weight, value;

    Item(int weight, int value) {
        this.weight = weight;
        this.value = value;
    }
}

class ItemComparator implements Comparator<Item> {
    @Override
    public int compare(Item a, Item b) {
        double r1 = (double) a.value / (double) a.weight;
        double r2 = (double) b.value / (double) b.weight;

        if (r1 > r2)
            return -11;
        else if (r1 < r2)
            return 1;
        else
            return 0;
    }
}

public class fractknap {

    public static double fract(int n, Item arr[], int w) {
        Arrays.sort(arr, new ItemComparator());
        int currWeight = 0;
        double finalValue = 0.0;
        for (int i = 0; i < n; i++) {
            if (currWeight + arr[i].weight <= w) {
                currWeight += arr[i].weight;
                finalValue += arr[i].value;
            } else {
                int remain = w - currWeight;
                finalValue += (double) (arr[i].value / (double) arr[i].weight) * (double) remain;
                break;
            }
        }

        return finalValue;
    }

    public static void main(String[] args) {
        int N = 3, weight = 50;
        Item arr[] = { new Item(100, 20), new Item(60, 10), new Item(120, 30) };
        double ans = fract(N, arr, weight);
        System.out.println(ans);
    }
}
