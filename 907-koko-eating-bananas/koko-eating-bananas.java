class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        
        int left = 1;
        int right = Arrays.stream(piles).max().getAsInt();
        while(left<right){
            int mid = left + (right - left)/2;
            int hourspent = 0;
            for(int pile : piles){
                hourspent+= (pile+mid -1)/mid;
            }
            if(hourspent <= h){
                right = mid;
            }else{
                left = mid + 1;
            }
    
        }
        return left;
    }
}