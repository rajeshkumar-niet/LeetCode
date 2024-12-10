class Solution {

    public boolean isSafe(char[][] board, int row, int col, int number){
        // Check row and column
        for(int i = 0; i < 9; i++){
            if(board[row][i] == (char)(number + '0')) {
                return false;
            }
            if(board[i][col] == (char)(number + '0')) {
                return false;
            }
        }

        // Check 3x3 sub-grid
        int sr = (row / 3) * 3;
        int sc = (col / 3) * 3;
        for(int i = sr; i < sr + 3; i++) {
            for(int j = sc; j < sc + 3; j++) {
                if(board[i][j] == (char)(number + '0')) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean helper(char[][] board, int row, int col) {
        // If we reached the last row
        if(row == 9) {
            return true;  // Puzzle solved
        }

        // If we reached the last column, move to next row
        int nrow = (col == 8) ? row + 1 : row;
        int ncol = (col == 8) ? 0 : col + 1;

        if(board[row][col] != '.') {
            return helper(board, nrow, ncol);  // Skip pre-filled cells
        }

        // Try numbers 1-9
        for(int i = 1; i <= 9; i++) {
            if(isSafe(board, row, col, i)) {
                board[row][col] = (char)(i + '0');  // Place the number
                if(helper(board, nrow, ncol)) {  // Recurse
                    return true;
                }
                board[row][col] = '.';  // Backtrack
            }
        }
        return false;
    }

    public void solveSudoku(char[][] board) {
        helper(board, 0, 0);  // Start solving from the top-left corner
    }
}
