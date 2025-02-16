class Solution {
    public boolean closeStrings(String word1, String word2) {
        if(word1.length() != word2.length()){
           return false;
        }
        if(word1.equals(word2)){
            return true;
        }
        Map<Character,Integer> freq1 = new HashMap<>();
        Map<Character,Integer> freq2 = new HashMap<>();

      

        for(int i=0;i<word1.length();i++){

            freq1.put(word1.charAt(i),freq1.getOrDefault(word1.charAt(i),0)+1);
            freq2.put(word2.charAt(i),freq2.getOrDefault(word2.charAt(i),0)+1);
        }
        if(!freq1.keySet().equals(freq2.keySet())){
            return false;
        }
        List<Integer> values1 = new ArrayList<>(freq1.values());
        List<Integer> values2 = new ArrayList<>(freq2.values());
        Collections.sort(values1);
        Collections.sort(values2);
       return values1.equals(values2);
    }
}