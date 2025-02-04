class Solution {
    public int longestMonotonicSubarray(int[] nums) {
       if(nums.length ==1){
        return 1;
       }
       int increlen =1;
       int decrelen =1;
       int maxlen =1;
       for(int i=1;i<nums.length;i++){
        if(nums[i]>nums[i-1]){
            increlen+=1;
            decrelen=1;
        }else if(nums[i]<nums[i-1]){
            increlen = 1;
            decrelen+=1;
        }else{
            increlen=1;
            decrelen=1;
        }
        maxlen = Math.max(maxlen,Math.max(increlen,decrelen));
       } 
       return maxlen;
    }
}