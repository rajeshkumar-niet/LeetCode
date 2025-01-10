class Solution {
    public static void swapRows(int[][] matrix, int start, int end, int n) {
        for (int i = 0; i < n; i++) {
            int temp = matrix[i][start];
            matrix[i][start] = matrix[i][end];
            matrix[i][end] = temp;
        }
    }
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        int start = 0;
        int end = n - 1;
        while (start < end) {
            swapRows(matrix, start, end, n);
            start++;
            end--;
        }
    }
}