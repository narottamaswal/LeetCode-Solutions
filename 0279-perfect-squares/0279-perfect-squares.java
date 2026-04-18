class Solution {
    public int numSquares(int n) {
        int[] dp = new int[n + 1];    
        Arrays.fill(dp, n); 
        dp[0] = 0; 

        int maxSquareRoot = (int) Math.sqrt(n);
        int[] squares = new int[maxSquareRoot + 1];
        for (int i = 1; i <= maxSquareRoot; i++) {
            squares[i] = i * i;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= maxSquareRoot; j++) {
                int square = squares[j];
                if (i < square) break;
                dp[i] = Math.min(dp[i], dp[i - square] + 1);
            }
        }        
        return dp[n];
    }
}