class Solution {
    public boolean solveSudoku(char[][] board) {
        int n = board.length;
        int row = -1;
        int col = -1;
        boolean isEmpty = true;

        // Find the first empty cell
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == '.') { // Use '.' to represent empty cells
                    row = i;
                    col = j;
                    isEmpty = false;
                    break;
                }
            }
        }

        // If the board is not empty, we are done
        if (isEmpty) {
            return true;
        }

        // Backtracking
        for (char num = '1'; num <= '9'; num++) {
            if (isSafe(board, row, col, num)) {
                board[row][col] = num;
                if (solveSudoku(board)) {
                    return true;
                } else {
                    board[row][col] = '.'; // Undo the current cell if the solution is not possible
                }
            }
        }

        return false; // No solution found
    }

    public boolean isSafe(char board[][], int row, int col, char num) {
        int n = board.length;
        int sqrt = (int) Math.sqrt(n);

        // Check row
        for (int i = 0; i < n; i++) {
            if (board[row][i] == num) {
                return false;
            }
        }

        // Check column
        for (int i = 0; i < n; i++) {
            if (board[i][col] == num) {
                return false;
            }
        }

        // Check box
        int boxStartRow = row - row % sqrt;
        int boxStartCol = col - col % sqrt;
        for (int i = boxStartRow; i < boxStartRow + sqrt; i++) {
            for (int j = boxStartCol; j < boxStartCol + sqrt; j++) {
                if (board[i][j] == num) {
                    return false;
                }
            }
        }

        return true; // If the number is safe to place
    }
}
