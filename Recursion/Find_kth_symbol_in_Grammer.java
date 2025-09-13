package Recursion;

public class Find_kth_symbol_in_Grammer {

    // CORRECT, BUT MEMORY LIMIT EXCEEDED

    // static int Solve(StringBuilder str,int n,int k,int i){
    //     if(i == n-1){
    //         System.out.println(str);
    //         return str.charAt(k-1) - '0';
    //     }
    //     // StringBuilder sb = new StringBuilder();
    //     for (int j = 0; j < str.length(); j++) {
    //         if(str.charAt(j) == '0'){
    //             str.replace(j,j+1,"01");
    //         }
    //         else{
    //             str.replace(j,j+1,"10");
    //         }
    //     }
    //     return Solve(str,n,k,i+1);
    // }

    // static int kthGrammar(int n, int k) {
    //     StringBuilder first = new StringBuilder("0");
    //     int ans = Solve(first,n,k,0);
    //     return ans;
    // }

    static int Solve(int n,int k){
        if(n == 1){
            return 0;
        }
        int mid = (int)Math.pow(2,n-1)/2;

        if(k <= mid){
            return Solve(n-1,k);
        }
        else{
            return 1-Solve(n-1,k-mid);
        }
    }

    static int kthGrammar(int n,int k){
        return Solve(n,k);
    }

    public static void main(String[] args) {
        int ans = kthGrammar(4, 6);
        System.out.println(ans);
    }
}
