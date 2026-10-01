class Solution {
    // Function to recursively heapify the array downwards
    private void heapifyDown(int[] arr, int ind) {
        int n = arr.length; // Size of the array

        // Index of smallest element
        int smallest_Ind = ind;

        // Indices of the left and right children
        int leftChild_Ind = 2 * ind + 1;
        int rightChild_Ind = 2 * ind + 2;

        // If the left child holds a smaller value, update the smallest index
        if (leftChild_Ind < n && arr[leftChild_Ind] < arr[smallest_Ind]) {
            smallest_Ind = leftChild_Ind;
        }

        // If the right child holds a smaller value, update the smallest index
        if (rightChild_Ind < n && arr[rightChild_Ind] < arr[smallest_Ind]) {
            smallest_Ind = rightChild_Ind;
        }

        // If the smallest element index is updated
        if (smallest_Ind != ind) {
            // Swap the smallest element with the current index
            int temp = arr[smallest_Ind];
            arr[smallest_Ind] = arr[ind];
            arr[ind] = temp;

            // Recursively heapify the lower subtree
            heapifyDown(arr, smallest_Ind);
        }
    }

    // Function to convert given array into a min-heap
    public void buildMinHeap(int[] nums) {
        int n = nums.length;

        // Iterate backwards on the non-leaf nodes
        for (int i = n / 2 - 1; i >= 0; i--) {
            // Heapify each node downwards
            heapifyDown(nums, i);
        }

        return;
    }
}