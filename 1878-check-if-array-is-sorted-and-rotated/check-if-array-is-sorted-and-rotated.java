class Solution {
    public boolean check(int[] nums) {
        int minidx = 0;
        int n = nums.length;
        for (int i = 1; i < n; i++) {
            if (nums[i] < nums[i - 1]) {
                minidx = i;
                break;
            }
        }

        System.out.println("minidx : " + minidx);
        for (int i = 0; i < n-1; i++) {
            if (nums[(i + minidx)%n] > nums[(i + 1 + minidx)%n]) {
                return false;
            }
        }

        return true;
    }
}