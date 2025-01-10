class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        if(n < 2)
            return n;
        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i < n ; i++){
            set.add(nums[i]);
        }
        int result = 0;
        int total = 0;
        for(int i : set){
            if(!set.contains(i-1)){
                int curr = i;
                total = 1;
                while(set.contains(curr +1)){
                    total++;
                    curr++;
                }
            }
            result = Math.max(result, total);
        }
        return result;
    }
}