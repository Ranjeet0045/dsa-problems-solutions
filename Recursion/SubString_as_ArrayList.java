package Recursion;

import java.util.ArrayList;

public class SubString_as_ArrayList {

    static ArrayList<String> substring(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = substring(ch + p, up.substring(1));
        ArrayList<String> right = substring(p, up.substring(1));
        left.addAll(right);
        return left;
    }

    public static void main(String[] args) {
        String str = "abc";
        ArrayList<String> ans = substring("",str);
        System.out.println(ans);
    }
}
