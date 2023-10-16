import java.util.*;

public class countsubstring {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = sc.nextInt();

        int x = count(str, n);
        int y = count(str, n - 1);

        System.out.println(x - y);
        sc.close();
    }

    /*
     * public static int count(String s, int k) {
     * 
     * boolean[] charArr = new boolean[26];
     * Arrays.fill(charArr, false);
     * int res = 0;
     * 
     * for (int i = 0; i < s.length(); i++) {
     * 
     * int distCount = 0;
     * 
     * for (int j = i; j < s.length(); j++) {
     * 
     * if (!charArr[s.charAt(j) - 'a']) {
     * charArr[s.charAt(j) - 'a'] = true;
     * distCount++;
     * }
     * 
     * if (distCount == k) {
     * res++;
     * }
     * 
     * }
     * }
     * 
     * return res;
     * }
     */

    public static int count(String s, int k) {

        HashMap<Character, Integer> map = new HashMap<>();
        int num = 0;
        int left = 0;

        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);

            while (map.size() > k) {
                map.put(s.charAt(left), map.getOrDefault(s.charAt(left), 0) - 1);
                if (map.get(s.charAt(left)) == 0) {
                    map.remove(s.charAt(left));
                }
                left++;
            }

            num += i - left + 1;

        }

        return num;

    }
}
