import java.util.Scanner;

class RotatedSortedArraySearch {
    private static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while(start <= end) {
            int mid = (start + end)/2;

            if(target == nums[mid]) {
                return mid;
            }

            if(nums[start] <= nums[mid]) { // left array is sorted
                if(target >= nums[start] && target < nums[mid]) { // target lies between start and mid index
                    end = mid-1;
                } else {
                    start = mid+1;
                }
            } else { // right array is sorted
                if(target > nums[mid] && target <= nums[end]) { // target lies between mid and end index
                    start = mid+1;
                } else {
                    end = mid-1;
                }
            }
        }

        return -1;
    }


    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int n = keyboard.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++) {
          nums[i] = keyboard.nextInt(); 
        }
        int target = keyboard.nextInt();
        keyboard.close();

        System.out.printf("Search(%d) = %d%n", target, search(nums, target));
    }
}