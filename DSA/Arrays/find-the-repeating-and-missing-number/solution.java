
import java.util.Arrays;

class Solution {
    public int[] findMissingRepeatingNumbers(int[] nums) {

        int n = nums.length;
        int repeating = -1;
        int missing = -1;

        Arrays.sort(nums);

        // Find repeating number
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                repeating = nums[i];
                break;
            }
        }

        // Find missing number
        for (int i = 1; i <= n; i++) {
            if (Arrays.binarySearch(nums, i) < 0) {
                missing = i;
                break;
            }
        }

        return new int[]{repeating, missing};
    }
}
