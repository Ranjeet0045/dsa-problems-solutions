package Graph.Implementation;

public class using_Adjacency_matrix {

    public static void createGraph(int[][] matrix) {

        matrix[0][2] = 2;

        matrix[1][2] = 10;
        matrix[1][3] = 0;

        matrix[2][0] = 2;
        matrix[2][1] = 10;
        matrix[2][3] = -1;

        matrix[3][1] = 0;
        matrix[3][2] = -1;
    }

    public static void main(String[] args) {
        int V = 4;

        // Create adjacency matrix
        int[][] matrix = new int[V][V];
        createGraph(matrix);

        // Print adjacency matrix
        System.out.println("Adjacency Matrix (with weights):");
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Example: Print neighbours of vertex 2
        System.out.println("Neighbours of vertex 2:");
        for (int j = 0; j < V; j++) {
            if (matrix[2][j] != 0 || j == 2) {
                System.out.println("2 -> " + j + " , weight = " + matrix[2][j]);
            }
        }
    }
}
