class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxones = 0, count = 0;
        for (int num : nums) {
            if (num == 1) {
                count++;
                if(count > maxones){
                    maxones = count;
                }
            } else {
                count = 0;

            }

        }
        return maxones;
    }
}