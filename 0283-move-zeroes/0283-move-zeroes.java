class Solution {
    public void moveZeroes(int[] nums) {
        int res[] = new int[nums.length];
        int respointer = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                res[respointer++] = nums[i];
            }
        }
        for (int i = 0; i < res.length; i++) {
            nums[i] = res[i];
        }
    }
}