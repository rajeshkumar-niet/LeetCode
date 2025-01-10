class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        int top = 0, left = 0;
        int bottom = m - 1, right = n - 1;
        while (top <= bottom && left <= right) {
            // Top traveser
            for (int i = left; i <= right; i++) {
                list.add(matrix[top][i]);
            }
            top++;
            // Right traveser
            for (int i = top; i <= bottom; i++) {
                list.add(matrix[i][right]);
            }
            right--;
            // Down traveser
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    list.add(matrix[bottom][i]);
                }
            }
            bottom--;
            // Left traveser
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    list.add(matrix[i][left]);
                }
            }
            left++;
        }
        return list;

    }
}