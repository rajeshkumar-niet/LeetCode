class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Boolean> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], true);
            } else {
                map.put(nums[i], false);
            }
        }
        for (HashMap.Entry<Integer, Boolean> entry : map.entrySet()) {
            if (!entry.getValue()) {
                return entry.getKey();
            }
        }
        return 0;
    }
}