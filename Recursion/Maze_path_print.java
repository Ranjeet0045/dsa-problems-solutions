package Recursion;

public class Maze_path_print {

    static void result(String str,int r,int c){
        if(r == 1 && c == 1){
            System.out.println(str);
            return;
        }

        if(r > 1){
            result(str + 'D', r-1, c);
        }
        if(c > 1){
            result(str + 'R', r, c-1);
        }
    }

    public static void main(String[] args) {
        int row = 3;
        int col = 3;
        result("",row,col);
    }
}
