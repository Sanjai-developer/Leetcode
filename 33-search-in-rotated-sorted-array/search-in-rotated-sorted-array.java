class Solution {
    public int search(int[] nums, int target) {
        int left =0,right = nums.length-1,result;
        result = modifiedbinarysearch(nums ,target,left,right );
        return result ;
    }
    public int modifiedbinarysearch (int[] arr,int target , int left, int right){
        if(left>right){
            return -1;
        }
         int mid = left + (right - left) /2;
         if(arr[mid] == target){
            return mid ;
         }
         if(arr[mid]>=arr[left]){
             if(arr[left] <=target && arr[mid] >= target){
            return modifiedbinarysearch(arr , target ,left, mid-1);
        }else{
            return modifiedbinarysearch(arr,target,mid+1 , right);
        }
         }
       else{

        if(arr[mid] <=target && arr[right] >= target){
            return modifiedbinarysearch(arr , target ,mid+1, right);
        }else{
            return modifiedbinarysearch(arr,target,left , mid-1);
        }
       }
    }

}