class Solution {
    
    public int[] insertionSort(int[] nums) {

        insertionSortHelper(nums, nums.length);
        return nums;
    }

 
    private void insertionSortHelper(int[] nums, int n) {
      
        if (n <= 1) {
            return;
        }

        
        insertionSortHelper(nums, n - 1);

    
        int last = nums[n - 1];
        int j = n - 2;
        
      
        while (j >= 0 && nums[j] > last) {
            nums[j + 1] = nums[j];
            j--;
        }
        
      
        nums[j + 1] = last;
    }
}

