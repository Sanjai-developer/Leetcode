import java.util.Arrays;

class Solution {
    public int maxOperations(int[] nums, int k) {
     Arrays.sort(nums);
     int count =0,left =0 ,right = nums.length-1;
            while(left<right){
        int sum = nums[left]+nums[right];
        if( sum == k){
            count++;
            left++;
            right--;
        }else if(sum <=k) {
           left++;
        }else {
            right--;
        }
     }return count; 
    }
}