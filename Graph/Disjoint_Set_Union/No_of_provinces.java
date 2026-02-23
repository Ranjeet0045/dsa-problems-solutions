package Graph.Disjoint_Set_Union;

public class No_of_provinces {

    static int[] parent;
    static int[] size;
    
    public static int find(int a){
        if(parent[a] == a) return a;
        return parent[a] = find(parent[a]);
    }

    public static void union(int a, int b){
        a = find(a);
        b = find(b);

        if(a != b){
            if(size[a] > size[b]){
                parent[b] = a;
                size[a] += size[b];
            }
            else{
                parent[a] = b;
                size[b] += size[a];
            }
        }
    }

    public static int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        parent = new int[n+1];
        size = new int[n+1];

        for(int i=1; i<=n; i++){
            parent[i] = i;
            size[i] = 1;
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i != j && isConnected[i][j] == 1)
                    union(i+1, j+1); 
            }
        }

        int count = 0;
        for(int i=1; i<=n; i++){
            if(parent[i] == i)
                count++;
        }

        return count;
    }
    public static void main(String[] args) {

        int[][] isConnected = {{1,1,0},{1,1,0},{0,0,1}};
        int ans = findCircleNum(isConnected);
        System.out.println(ans);
    }
}
