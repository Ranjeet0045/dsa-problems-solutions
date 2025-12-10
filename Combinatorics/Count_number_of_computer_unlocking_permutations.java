package Combinatorics;

public class Count_number_of_computer_unlocking_permutations {

    static final int MOD = 1000000007;

    public static int countPermutations(int[] complexity) {
        int n = complexity.length;
        int first = complexity[0];
        for(int i=1; i<n; i++){
            if(complexity[i] <= first){
                return 0;
            }
        }

        return (int)(factorial(n-1) % MOD);
    }
    public static long factorial(int n){
        long fact = 1L;

        for(int i=1; i<=n; i++){
            fact = (fact*i) % MOD;
        }
        return fact % MOD;
    }
    public static void main(String[] args) {
        int[] complexity = {1,2,3};
        int ans = countPermutations(complexity);
        System.out.println(ans);
    }
}
