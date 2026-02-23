package Graph.Floyed_warshall;

public class Main {
    static int INF = (int)(Math.pow(10, 8));

    public static void floydWarshall(int[][] dist) {
        int m = dist.length;

        for(int k=0; k<m; k++){
            for(int i=0; i<m; i++){
                for(int j=0; j<m; j++){
                    dist[i][j] = Math.min(dist[i][j], dist[i][k] + dist[k][j]);
                }
            }
        }

        for(int i=0; i<m; i++){
            for (int j = 0; j < m; j++) {
                if (dist[i][j] == INF) {
                    System.out.print(-1 + " ");
                } else {
                    System.out.print(dist[i][j] + " ");
                }
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] dist = {{0,4,INF,5,INF},{INF,0,1,INF,6},{2,INF,0,3,INF},{INF,INF,1,0,2},{1,INF,INF,4,0}};
        floydWarshall(dist);
    }
}
