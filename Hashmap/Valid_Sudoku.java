package Hashmap;

import java.util.HashSet;

public class Valid_Sudoku {

    private static boolean isValidSudoku(char[][] board) {

        HashSet<Character> rowSet = new HashSet<>();
        HashSet<Character> colSet = new HashSet<>();
        HashSet<Character> subgridSet = new HashSet<>();

        for(int i=0; i<9; i++){

            rowSet.clear();
            for(int j=0; j<9; j++){
                if(board[i][j] == '.'){
                    continue;
                }
                else if(rowSet.contains(board[i][j])){
                    return false;
                }
                else{
                    rowSet.add(board[i][j]);
                }
            }

            colSet.clear();
            for(int j=0; j<9; j++){
                if(board[j][i] == '.'){
                    continue;
                }
                else if(colSet.contains(board[j][i])){
                    return false;
                }
                else{
                    colSet.add(board[j][i]);
                }
            }

            subgridSet.clear();
            for(int j=0; j<9; j++){
                int row = 3*(i/3) + j/3;
                int col = 3*(i%3) + j%3;

                if(board[row][col] == '.'){
                    continue;
                }
                else if(subgridSet.contains(board[row][col])){
                    return false;
                }
                else{
                    subgridSet.add(board[row][col]);
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        char[][] board = {{'5','3','.','.','7','.','.','.','.'}
                        ,{'6','.','.','1','9','5','.','.','.'}
                        ,{'.','9','8','.','.','.','.','6','.'}
                        ,{'8','.','.','.','6','.','.','.','3'}
                        ,{'4','.','.','8','.','3','.','.','1'}
                        ,{'7','.','.','.','2','.','.','.','6'}
                        ,{'.','6','.','.','.','.','2','8','.'}
                        ,{'.','.','.','4','1','9','.','.','5'}
                        ,{'.','.','.','.','8','.','.','7','9'}};

        boolean ans = isValidSudoku(board);
        System.out.println(ans);
    }
}
