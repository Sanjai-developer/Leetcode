

public class Solution {
    public int tupleSameProduct(int[] nums) {
        Map<Integer, Integer> productCount = new HashMap<>();
        int n = nums.length;

        // Calculate products for every unique pair (i, j)
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int product = nums[i] * nums[j];
                productCount.put(product, productCount.getOrDefault(product, 0) + 1);
            }
        }

        // Calculate the total number of valid tuples
        int totalTuples = 0;
        for (int count : productCount.values()) {
            if (count > 1) {
                totalTuples += count * (count - 1) * 4; // Using the formula
            }
        }

        return totalTuples;
    }
}
