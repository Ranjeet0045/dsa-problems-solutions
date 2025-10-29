package Two_D_Array;

import java.util.ArrayList;

class Distance_of_nearest_cell_heving_1{

    public static ArrayList<ArrayList<Integer>> nearest(int[][] grid) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        int m = grid.length;
        int n = grid[0].length;

        for(int i=0; i<m; i++){
            ArrayList<Integer> temp = new ArrayList<>();

            for(int j=0; j<n; j++){
                if(grid[i][j] == 1){
                    temp.add(0);
                }
                else{
                    int dist = 1;
                    for(int k=j+1; k<n; k++){
                        if(grid[i][k] == 1){
                            break;
                        }
                        else{
                            dist++;
                        }
                    }
                    temp.add(dist);
                }
            }
            ans.add(temp);
        }
        

        return ans;
    }
    public static void main(String[] args) {
        int[][] grid = {{0, 1, 1, 0}, 
                        {1, 1, 0, 0}, 
                        {0, 0, 1, 1}};

        ArrayList<ArrayList<Integer>> ans = nearest(grid);
        System.out.println(ans);
    }
}