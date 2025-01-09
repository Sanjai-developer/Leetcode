class Solution {
    public String reverseWords(String s) {
        String[] a = s.split("\\s+");
        StringBuilder result = new StringBuilder() ;
        for(int i =a.length-1 ;i>=0;i--){
            result.append(a[i]);
            if(i>0){
                result.append(" ");
            }
        }
        return result.toString().trim();
    }
}