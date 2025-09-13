public class TicTacToe {

    static String tictactoe(int[][] moves) {
        char[][] board = new char[3][3];
        
        // Fill board with moves: A = 'X', B = 'O'
        for (int i = 0; i < moves.length; i++) {
            int r = moves[i][0], c = moves[i][1];
            board[r][c] = (i % 2 == 0) ? 'X' : 'O';
        }

        // Check rows and columns
        for (int i = 0; i < 3; i++) {
            // Row
            if (board[i][0] != 0 && board[i][0] == board[i][1] && board[i][1] == board[i][2]) {
                return board[i][0] == 'X' ? "A" : "B";
            }
            // Column
            if (board[0][i] != 0 && board[0][i] == board[1][i] && board[1][i] == board[2][i]) {
                return board[0][i] == 'X' ? "A" : "B";
            }
        }

        // Check diagonals
        if (board[0][0] != 0 && board[0][0] == board[1][1] && board[1][1] == board[2][2]) {
            return board[0][0] == 'X' ? "A" : "B";
        }
        if (board[0][2] != 0 && board[0][2] == board[1][1] && board[1][1] == board[2][0]) {
            return board[0][2] == 'X' ? "A" : "B";
        }

        // If all moves played
        if (moves.length == 9) return "Draw";

        // Otherwise still pending
        return "Pending";
    }

    public static void main(String[] args) {
        int[][] moves = {{0,0},{1,1},{0,1},{0,2},{1,0},{2,0}};
        String ans = tictactoe(moves);
        System.out.println(ans);  // Should print "A"
    }
}
