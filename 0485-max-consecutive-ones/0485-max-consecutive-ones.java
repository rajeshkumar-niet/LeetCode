class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                int r = 0;
                while (i < nums.length && nums[i] == 1) {
                    i++;
                    r++;
                }
                result = Math.max(result, r);
            }
        }

        return result;
    }
}