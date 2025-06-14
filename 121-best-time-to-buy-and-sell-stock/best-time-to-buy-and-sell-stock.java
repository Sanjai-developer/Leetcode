class Solution {
    public int maxProfit(int[] prices) {
      int minprice = Integer.MAX_VALUE;
      int max =0 ;
      for(int price : prices){
        if(price<minprice){
            minprice = price;
        }
        else{
            max = Math.max(max , price-minprice);
        }
      }
      return max;
    }
}