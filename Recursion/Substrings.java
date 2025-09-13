package Recursion;

public class Substrings {

    static void ans(String p,String up){
        if(up.isEmpty()){
            System.out.print(p + " ");
            return;
        }
        char ch = up.charAt(0);
        ans(p+ch,up.substring(1));
        ans(p,up.substring(1));
    }

    public static void main(String[] args) {
        ans("","abc");
    }
}
