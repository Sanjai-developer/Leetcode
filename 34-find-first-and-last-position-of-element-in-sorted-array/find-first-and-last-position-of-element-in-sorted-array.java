class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = binarysearch(nums, target,true);
        int last = binarysearch(nums, target,false);
        return new int[]{first, last};
    }
    public int binarysearch(int[] nums,int target,boolean findfirst){
        int left =0;
        int right = nums.length-1;
        int result = -1;
        while(left<=right){
            int mid= left+ (right - left) /2;
            if(nums[mid] == target){
                result= mid ;
                if(findfirst){
                    right = mid -1 ;
                }else{
                    left = mid +1;
                }
            }
           else if(nums[mid]< target){
                 left = mid+1;
           }else{
            right = mid-1;
           }
        }
        return result ;
    }
}