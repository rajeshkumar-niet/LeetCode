class Solution {
    public int missingNumber(int[] nums) {
        // HashSet<Integer> set = new HashSet<>();
        // for (int i = 0; i < nums.length; i++) {
        //     set.add(nums[i]);
        // }
        // for (int i = 0; i <= nums.length; i++) {
        //     if (!set.contains(i)) {
        //         return i;
        //     }
        // }

        // return -1;

        // Optimal

        int n = nums.length;
        int totalSum = (n * (n + 1)) / 2;
        int currSum = 0;
        for (int i = 0; i < nums.length; i++) {
            currSum += nums[i];
        }
        return totalSum - currSum;
    }
}