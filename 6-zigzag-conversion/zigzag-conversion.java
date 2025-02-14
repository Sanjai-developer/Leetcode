

public class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1) return s;  // Edge case: No zigzag needed
        
        List<StringBuilder> rows = new ArrayList<>();
        for (int i = 0; i < Math.min(numRows, s.length()); i++) {
            rows.add(new StringBuilder()); // Create string builder for each row
        }

        int currRow = 0;  
        boolean goingDown = false; // To track movement direction
        
        for (char c : s.toCharArray()) {
            rows.get(currRow).append(c);  // Append character to the current row
            
            // Change direction if at the top or bottom row
            if (currRow == 0 || currRow == numRows - 1) {
                goingDown = !goingDown;
            }
            currRow += goingDown ? 1 : -1;  // Move up or down
        }

        // Merge all rows to form the final output string
        StringBuilder result = new StringBuilder();
        for (StringBuilder row : rows) {
            result.append(row);
        }

        return result.toString();
    }
}

    