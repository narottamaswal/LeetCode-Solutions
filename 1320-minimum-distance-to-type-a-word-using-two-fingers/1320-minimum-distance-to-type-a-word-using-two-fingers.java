record Coord(int x, int y) {}

class Solution {
    Map<Character, Coord> mp = new HashMap<>();
    int[][][] memo; // [index][left finger: 0=unplaced, 1-26=A-Z][right finger]

    public int dfs(String word, int i, int left, int right) {
        if (i == word.length()) return 0;

        // Return cached result if already computed
        if (memo[i][left][right] != -1) return memo[i][left][right];

        char ch = word.charAt(i);
        int ci = ch - 'A' + 1; // 1-indexed letter
        Coord c = mp.get(ch);

        // Cost if left finger types this character (0 if unplaced)
        int dL = (left == 0) ? 0 : cost(mp.get((char)('A' + left - 1)), c);
        int leftA = dL + dfs(word, i + 1, ci, right);

        // Cost if right finger types this character (0 if unplaced)
        int dR = (right == 0) ? 0 : cost(mp.get((char)('A' + right - 1)), c);
        int rightA = dR + dfs(word, i + 1, left, ci);

        return memo[i][left][right] = Math.min(leftA, rightA);
    }

    private int cost(Coord a, Coord b) {
        return Math.abs(a.x() - b.x()) + Math.abs(a.y() - b.y());
    }

    public int minimumDistance(String word) {
        int i = 0, row = 0, col = 0;
        while (i < 26) {
            char a = (char)(i + 'A');
            mp.put(a, new Coord(row, col));
            col++;
            if (col == 6) { col = 0; row++; }
            i++;
        }

        // 301 indices × 27 left states × 27 right states
        memo = new int[word.length() + 1][27][27];
        for (int[][] layer : memo)
            for (int[] row2 : layer)
                java.util.Arrays.fill(row2, -1);

        return dfs(word, 0, 0, 0); // 0 = both fingers unplaced
    }
}