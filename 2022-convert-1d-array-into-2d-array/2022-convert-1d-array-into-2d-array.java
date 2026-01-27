class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        if (original.length != m * n)
            return new int[0][0];

        int[][] result = new int[m][n];

        int row = 0, c = 0;
        for (int i = 0; i < original.length && row < m;) {
            for (int j = 0; j < n && i < original.length; j++) {
                result[row][j] = original[i];
                i++;
            }
            row++;
        }

        return result;
    }
}