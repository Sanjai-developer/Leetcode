class Solution {
    public int maxAscendingSum(int[] nums) {
        //We Can use sliding window for this problem as per my suggestion 
        int current =nums[0];
        int max =nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                current +=nums[i];
            }else{
                current = nums[i];
            }
            max = Math.max(max,current);
        }return max;
    }
}