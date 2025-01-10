class Solution {
    public int[] productExceptSelf(int[] nums) {
      int pre=1,n=nums.length;      
       int result[]= new int[n];
        for(int i=0;i<n-1;i++){
                pre = pre*nums[i];
                 result[i] =  pre;
             }pre =1;
             for(int i=n-1;i>0;i--){
                result[i] = result[i-1] * pre;
                pre=pre*nums[i];           
             }
             result[0]= pre;
             return result;
    }
}