package LeetCodeDailyQuestions;

public class August_22 {

    static int minArea(int[][] grid) {
        
        int area = 1;

        int leftMost = Integer.MAX_VALUE;
        int rightMost = -1;
        int topMost = Integer.MAX_VALUE;
        int bottomMost = -1;

        int row = grid.length;
        int col = grid[0].length;

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(grid[i][j] == 1){
                    if(j < leftMost){
                        leftMost = j;
                    }
                    if(j > rightMost){
                        rightMost = j;
                    }
                    if(i < topMost){
                        topMost = i;
                    }
                    if(i > bottomMost){
                        bottomMost = i;
                    }
                }
            }
        }

        int width = rightMost - leftMost + 1;
        int height = bottomMost - topMost + 1;

        if((width * height) > area){
            area = width * height;
        }

        return area;

    }

    public static void main(String[] args) {
        int[][] grid = {{1,0},{0,0}};
        int ans = minArea(grid);
        System.out.println(ans);
    }

}
