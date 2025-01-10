class Solution {
    public static void make0(int[][] matrix, int row, int col){
        for(int i = 0; i < matrix.length; i++){
            matrix[i][col] = 0;
        }
        for(int j = 0; j < matrix[0].length; j++){
            matrix[row][j] = 0;
        }
    }

    public void setZeroes(int[][] matrix) {
        List<int[]> zeros = new ArrayList<>();
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(matrix[i][j] == 0){
                    zeros.add(new int[]{i, j});
                }
            }
        }

        // Traversing the ArrayList
        for (int[] array : zeros) {
            make0(matrix, array[0], array[1]);
        }
    }
}