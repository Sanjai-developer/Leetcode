import java.util.*;

class Solution {
    public int findShortestSubArray(int[] nums) {
        Map<Integer, Integer> count = new HashMap<>();
        Map<Integer, Integer> first = new HashMap<>();
        Map<Integer, Integer> last = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            count.put(n, count.getOrDefault(n, 0) + 1);
            if (!first.containsKey(n)) {
                first.put(n, i);
            }
            last.put(n, i);
        }
        
        int degree = Collections.max(count.values());
        int minLen = nums.length;
        
        for (int key : count.keySet()) {
            if (count.get(key) == degree) {
                minLen = Math.min(minLen, last.get(key) - first.get(key) + 1);
            }
        }
        
        return minLen;
    }
}
