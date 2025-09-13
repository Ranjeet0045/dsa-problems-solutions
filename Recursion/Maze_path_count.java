package Recursion;

public class Maze_path_count {

    static int result(int r,int c){
        if(r == 1 || c == 1){
            return 1;
        }
        int left = result(r-1,c);
        int right = result(r,c-1);
        return left + right;
    }

    public static void main(String[] args) {
        int row = 4;
        int col = 4;
        System.out.println(result(row,col));
    }
}
