record Coord(int x, int y) {}

class Solution {
    Map<Character, Coord> mp = new HashMap<>();
    int[][][] memo; // [index][left finger: 0=unplaced, 1-26=A-Z][right finger : 0=unplaced, 1-26=A-Z]

    private int cost(Coord a, Coord b) {
        return Math.abs(a.x() - b.x()) + Math.abs(a.y() - b.y());
    }

    public int dfs(String word, int i, int left, int right) {
        if (i == word.length()){
            return 0;
        } 
        if (memo[i][left][right] != -1){
            return memo[i][left][right];
        } 
        char ch = word.charAt(i);

        int chIndex = ch - 'A' + 1;
        Coord c = mp.get(ch);

        // Cost if left finger types this character (0 if unplaced)
        char leftFingerChar = (char)('A' + left - 1);
        int currLeftDist = (left == 0) ? 0 : cost(mp.get(leftFingerChar), c);
        int leftDist = currLeftDist + dfs(word, i + 1, chIndex, right);

        // Cost if right finger types this character (0 if unplaced)
        char rightFingerChar = (char)('A' + right - 1);
        int currRightDist = (right == 0) ? 0 : cost(mp.get(rightFingerChar), c);
        int rightDist = currRightDist + dfs(word, i + 1, left, chIndex);

        return memo[i][left][right] = Math.min(leftDist, rightDist);
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
        // here 27 as 0 for unplaced and 26 chars from (1 to 26) 
        return dfs(word, 0, 0, 0);
    }
}