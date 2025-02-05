class Solution {
    public int pivotIndex(int[] nums) {
    int left =0,right =0,totalsum =0;
    for (int i=0;i<nums.length;i++){
        totalsum+=nums[i];
    }
    for(int i=0;i<nums.length;i++){
        if(left == totalsum - left - nums[i]){
            return i;
        }else{
            left+=nums[i];
        }
    }return -1;
    }

}