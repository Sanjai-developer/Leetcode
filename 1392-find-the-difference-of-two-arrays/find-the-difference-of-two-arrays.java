class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        //convert array to hashset 
        Set<Integer> set1 = new HashSet<>();
        for(int num : nums1){
            set1.add(num);
        }

        Set<Integer> set2 = new HashSet<>();
        for(int num : nums2){
            set2.add(num);
        }
        //finding answer[0]
        ArrayList<Integer> differ1 = new ArrayList<>();
        for(int num : set1){
            if(!set2.contains(num)){
                differ1.add(num);
            }
        }
        ArrayList<Integer> differ2 = new ArrayList<>();
        for(int num : set2){
            if(!set1.contains(num)){
                differ2.add(num);
            }
        }
        //Result list 
        List<List<Integer>> answer = new ArrayList<>();
        answer.add(differ1);
        answer.add(differ2);

        return answer;
        

    }
}