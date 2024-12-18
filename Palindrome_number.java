class Solution {
    public boolean isPalindrome(int x) {
       String num = x+"";
        String rev ="";
       for(int i=num.length()-1;i>=0;i--){
           rev +=num.charAt(i);
         } 
         if(num.equals(rev)){
            return true;
         }else{
            return false;
         }
    }
}