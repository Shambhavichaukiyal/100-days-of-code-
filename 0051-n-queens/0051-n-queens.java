class Solution {
    public List<List<String>> solveNQueens(int n) 
    {
        boolean board[][]= new boolean[n][n];
        List<List<String>> result = new ArrayList<>();
        nqueen(board,0,result);
        return result;
        
        
    }
       public static void nqueen(boolean board[][], int r, List<List<String>> result) {
        if (r == board.length) {
            List<String> current = new ArrayList<>();
            for (int i = 0; i < board.length; i++) {
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < board.length; j++) {
                    if (board[i][j]) {
                        sb.append("Q");
                    } else {
                        sb.append(".");
                    }
                }
                current.add(sb.toString());
            }
            result.add(current);
            return;
        }
        for (int i = 0; i < board.length; i++) {
            if (isSafe(board, r, i)) {
                board[r][i] = true;
                nqueen(board, r + 1, result);
                board[r][i] = false;
            }
        }
    }
    static boolean isSafe(boolean board[][], int r, int c) {
        // Check column
        for (int i = 0; i < r; i++) {
            if (board[i][c]) {
                return false;
            }
        }
        // Check upper left diagonal
        for (int i = r, j = c; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j]) {
                return false;
            }
        }
        // Check upper right diagonal
        for (int i = r, j = c; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j]) {
                return false;
            }
        }
        return true;
    }}