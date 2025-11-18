package Dynamic_programming.Tabulation;

public class Count_sqaure_submatrices_of_all_ones {

    public static int countSquares(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int count = 0;

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(matrix[i][j] == 0) continue;
                if(i>0 && j>0){
                    matrix[i][j] += Math.min(matrix[i-1][j],Math.min(matrix[i][j-1],matrix[i-1][j-1]));
                }
                count += matrix[i][j];
            }
        }

        return count;
    }
    public static void main(String[] args) {
        int[][] matrix =   {{0,1,1,1},
                            {1,1,1,1},
                            {0,1,1,1}};

        int ans = countSquares(matrix);
        System.out.println(ans);
    }
}
