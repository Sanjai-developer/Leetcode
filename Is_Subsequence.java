class Solution {
    public boolean isSubsequence(String s, String t) {
        char[]a = s.toCharArray();
        char[]b = t.toCharArray();
        int count =0,i=0;
    
            for(int j=0;j<b.length;j++){
                if(i<a.length&&a[i] == b[j]){
                    count++;
                    i++;
                }
            }
        return a.length == count ;
    }
}