class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int exp = n * (n + 1) / 2;
        int actualsum = 0;
        for (int num : nums) {
            actualsum += num;
        }
        return exp - actualsum;
    }
}