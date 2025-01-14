class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
         int maxcandies =0;
         int size = candies.length ;
        for (int i =0 ; i < size ;i++) {
            if( candies[i]> maxcandies){
                maxcandies = candies[i] ;
            }
        }
        for (int i =0 ; i < size ; i++) {
           if(candies[i] + extraCandies >= maxcandies)  {
                result.add(true);
            } else {
                result.add(false);
            }
           
        }
        return result;
    }
}