class Solution {
    public int longestSubarray(int[] nums) {
      int left =0;
      int maxlen = 0;
      int zero = 0;
      for(int i=0;i<nums.length;i++){
        zero += nums[i] == 0 ? 1 : 0;
        while(zero>1){
            zero -= nums[left] == 0?1:0;
            left ++;
        }
        maxlen = Math.max(maxlen,i-left);
      }
      return maxlen;  
    }
}