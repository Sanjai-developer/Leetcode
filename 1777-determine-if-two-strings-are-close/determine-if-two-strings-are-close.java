import java.util.Arrays;

public class Solution {
    public boolean closeStrings(String word1, String word2) {
        // Step 1: Check if lengths are equal
        if (word1.length() != word2.length()) {
            return false;
        }

        // Step 2: Initialize frequency arrays
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        // Step 3: Count character frequencies
        for (char c : word1.toCharArray()) {
            freq1[c - 'a']++;
        }
        for (char c : word2.toCharArray()) {
            freq2[c - 'a']++;
        }

        // Step 4: Check if both strings have the same unique characters
        for (int i = 0; i < 26; i++) {
            if ((freq1[i] == 0 && freq2[i] != 0) || (freq1[i] != 0 && freq2[i] == 0)) {
                return false;
            }
        }

        // Step 5: Sort frequency arrays
        Arrays.sort(freq1);
        Arrays.sort(freq2);

        // Step 6: Compare sorted frequency arrays
        for (int i = 0; i < 26; i++) {
            if (freq1[i] != freq2[i]) {
                return false;
            }
        }

        // If all checks pass, the strings are close
        return true;
    }
}
