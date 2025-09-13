package Recursion;

public class triangle {

    static void Printtriangle(int row,int col){
        if(row == 0){
            return;
        }
        if(col < row){
            
            Printtriangle(row,col+1);
            System.out.print("*");
        }
        else{
            
            Printtriangle(row-1,0);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Printtriangle(4,0);
    }
}
