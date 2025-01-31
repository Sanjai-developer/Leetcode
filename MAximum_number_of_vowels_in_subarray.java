class Solution {
    public boolean isvowel(char s){
                return (s == 'a' || s == 'e' || s =='i' || s == 'o' || s=='u');
            }
    
        public int maxVowels(String s, int k) {
          int count =0;
          int max =0;
          char [] string = s.toCharArray();
           for (int i =0 ;i<k;i++){
            if(isvowel(string[i])){
                count++;
            }
           }
           max =count;
           for(int i=k;i<string.length;i++){
            if(isvowel(string[i-k])){
                count --;
            }
            if(isvowel(string[i])){
                count++;
                max = Math.max(max,count);
            }
           }
            return max;
        }
    }