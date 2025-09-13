
import java.util.ArrayList;
import java.util.List;

public class Spiral_Matrix {

    static ArrayList<Integer> spiralOrder(int[][] matrix){
        ArrayList<Integer> list = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        int srow = 0,scol = 0,erow = m-1,ecol = n-1;
        while(srow <= erow && scol <= ecol){
            for (int j = scol ; j <= ecol; j++) {
                list.add(matrix[srow][j]);
            }
            srow++;
            for (int i = srow; i <= erow; i++) {
                list.add(matrix[i][ecol]);
            }
            ecol--;
            if(srow <= erow){
            for (int j = ecol-1 ; j >= scol; j--) {
                list.add(matrix[erow][j]);
            }
            erow--;
            }
            if(scol <= ecol){
            for (int i = erow-1; i >= srow+1; i--) {
                list.add(matrix[i][scol]);
            }
            scol++;
            }
            }
        return list;
    }

    public static void main(String[] args) {
        int[][] arr = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        List<Integer> ans = spiralOrder(arr);
        System.out.println(ans);
    }
}
