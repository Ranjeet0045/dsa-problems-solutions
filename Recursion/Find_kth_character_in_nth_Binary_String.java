package Recursion;

public class Find_kth_character_in_nth_Binary_String {

    static char Solve(StringBuilder str,int n,int k,int i){
        if(i == n-1){
            return str.charAt(k-1);
        }
        StringBuilder invert = new StringBuilder();
        for(int j=0; j<str.length(); j++){
            char ans = (char) (str.charAt(j) ^ 1);
            invert.append(ans);
        }
        invert.reverse();
        StringBuilder ans = str.append(1);
        ans.append(invert);
        return Solve(ans,n,k,i+1);
    }
    static char findKthBit(int n, int k) {
        StringBuilder first = new StringBuilder("0");
        char ans = Solve(first,n,k,0);
        return ans;
    }

    public static void main(String[] args) {
        int n = 4;
        int k = 11;
        System.out.println(findKthBit(n,k));
    }
}
