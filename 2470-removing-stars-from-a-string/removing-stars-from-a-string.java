class Solution {
    public String removeStars(String s) {
        StringBuilder result = new StringBuilder();
        for(char ch : s.toCharArray()){
            if(ch == '*'){
                result.setLength(result.length()-1);   // like pop in stack 
            }else{
            result.append(ch);
            }
        }
        return result.toString();
    }
}