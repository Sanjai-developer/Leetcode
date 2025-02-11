class Solution {
    public boolean isPerfectSquare(int num) {
        if (num < 2) return true; // Edge case: 1 is a perfect square

        int left = 1, right = num;

        while (left <= right) {
            int mid = left + (right - left) / 2; // Prevents overflow
            long square = (long) mid * mid; // Use long to avoid overflow

            if (square == num) return true;
            else if (square < num) left = mid + 1;
            else right = mid - 1;
        }

        return false; // Not a perfect square
    }
}

