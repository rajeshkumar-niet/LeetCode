class Solution {
    public int removeDuplicates(int[] nums) {
        int temp = 0;
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (!set.contains(nums[i])) {
                set.add(nums[i]);
                nums[temp++] = nums[i];
            }
        }
        
        return set.size();
    }
}