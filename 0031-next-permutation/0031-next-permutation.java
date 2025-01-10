class Solution {
    public static void reverse(int[] nums, int small, int end) {
        while (small < end) {
            int temp = nums[small];
            nums[small] = nums[end];
            nums[end] = temp;
            small++;
            end--;
        }
    }

    public static void nextPermutation(int[] nums) {
        int pivot = -1;
        int n = nums.length;
            for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                pivot = i;
                break;
            }
        }

        if (pivot == -1) {
            reverse(nums, 0, n - 1);
            return;
        }

        int successor = -1;
        for (int i = n - 1; i > pivot; i--) {
            if (nums[i] > nums[pivot]) {
                successor = i;
                break;
            }
        }

        int temp = nums[pivot];
        nums[pivot] = nums[successor];
        nums[successor] = temp;

        reverse(nums, pivot + 1, n - 1);
    }

}