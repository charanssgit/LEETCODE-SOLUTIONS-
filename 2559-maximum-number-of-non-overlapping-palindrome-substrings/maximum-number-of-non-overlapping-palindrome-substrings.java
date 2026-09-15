class Solution {
    public int maxPalindromes(String s, int k) {
        int n = s.length();

        boolean[][] palindrome = new boolean[n][n];

        // Find all palindromic substrings
        for (int i = n - 1; i >= 0; i--) {
            for (int j = i; j < n; j++) {

                if (s.charAt(i) == s.charAt(j) &&
                    (j - i <= 1 || palindrome[i + 1][j - 1])) {

                    palindrome[i][j] = true;
                }
            }
        }

        int[] dp = new int[n + 1];

        for (int i = 1; i <= n; i++) {

            // Don't select a palindrome ending here
            dp[i] = dp[i - 1];

            // Try every starting position
            for (int j = 0; j < i; j++) {

                int length = i - j;

                if (length >= k && palindrome[j][i - 1]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }

        return dp[n];
    }
}