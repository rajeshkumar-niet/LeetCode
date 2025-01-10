class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] pos = new int[n/2];
        int p = 0;
        int[] neg = new int[n/2];
        int m = 0;
        for(int i = 0; i < n; i++){
            if(nums[i] < 0){
                neg[m++] = nums[i];
                
            }else{
                pos[p++] = nums[i];
            }
        }
        p = 0;
        m = 0;
        for(int i = 0; i < n; i++){
            if(i%2==0){
                nums[i] = pos[p++];
            }else{
                nums[i] = neg[m++];
            }
        }

        return nums;
    }
}