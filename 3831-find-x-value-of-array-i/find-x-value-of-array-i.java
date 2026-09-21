class Solution {
    public long[] resultArray(int[] nums, int k) {
        long[] ans = new long[k];
        long[] dp = new long[k];

        for (int num : nums) {
            long[] nextDp = new long[k];
            int val = num % k;

            
            for (int rem = 0; rem < k; rem++) {
                if (dp[rem] > 0) {
                    nextDp[(rem * val) % k] += dp[rem];
                }
            }

            
            nextDp[val]++;

            for (int r = 0; r < k; r++) {
                ans[r] += nextDp[r];
            }

            dp = nextDp;
        }

        return ans;
    }
}