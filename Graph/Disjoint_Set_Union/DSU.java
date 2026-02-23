package Graph.Disjoint_Set_Union;

public class DSU {

    private int[] parent;
    private int[] rank;

    //Constructor
    public DSU(int n){
        parent = new int[n];
        rank = new int[n];

        //Initially, every node is it's own parent
        for(int i=0; i<n; i++){
            parent[i] = i;
            rank[i] = 0;
        }
    }

    //find with path compression
    public int find(int x){
        if(parent[x] != x)
            parent[x] = find(parent[x]);
        return parent[x];
    }

    //Union by rank
    public void union(int a, int b){
        int rootA = find(a);
        int rootB = find(b);

        //Already in same set
        if(rootA == rootB){
            return;
        }

        //Attach smaller rank tree under bigger rank tree
        if(rank[rootA] < rank[rootB]){
            parent[rootA] = rootB;
        }
        else if(rank[rootA] > rank[rootB]){
            parent[rootB] = rootA;
        }
        else{
            parent[rootB] = rootA;
            rank[rootA]++;
        }
    }

    //Check if two nodes are connected
    public boolean isConnected(int a, int b){
        return find(a) == find(b);
    }
    public static void main(String[] args) {
        DSU dsu = new DSU(7);
        
        dsu.union(0, 1);
        dsu.union(1, 2);
        dsu.union(3, 4);
        dsu.union(5, 6);

        System.out.println(dsu.isConnected(0, 2));
        System.out.println(dsu.isConnected(0, 3));

        dsu.union(2, 3);

        System.out.println(dsu.isConnected(0, 4));
        System.out.println(dsu.isConnected(4, 6));
    }
}
