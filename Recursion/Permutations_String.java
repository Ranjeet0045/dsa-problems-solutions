package Recursion;

public class Permutations_String {

    static void permutation(String p,String up){
        if(up.isEmpty()){
            System.out.print(p + " ");
            return;
        }
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String first = p.substring(0, i);
            String second = p.substring(i,p.length());
            permutation(first + ch + second, up.substring(1));
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        permutation("",str);
    }
}
