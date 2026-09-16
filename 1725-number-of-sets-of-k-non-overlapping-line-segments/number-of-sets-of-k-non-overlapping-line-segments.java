class Solution {
    private static final int MOD = 1_000_000_007;

    public int numberOfSets(int n, int k) {
        long N = n + k - 1;
        long K = 2 * k;

        if (K > N) return 0;

        long num = 1, den = 1;
        for (int i = 1; i <= K; ++i) {
            num = (num * (N - i + 1)) % MOD;
            den = (den * i) % MOD;
        }

        return (int) ((num * power(den, MOD - 2)) % MOD);
    }

    private long power(long base, long exp) {
        long res = 1;
        base %= MOD;
        while (exp > 0) {
            if (exp % 2 == 1) res = (res * base) % MOD;
            base = (base * base) % MOD;
            exp /= 2;
        }
        return res;
    }
}