class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxones = 0, count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
                maxones = Math.max(count, maxones);
            } else {
                count = 0;

            }

        }
        return maxones;
    }
}