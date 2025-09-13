package Recursion;

import java.util.*;

public class Permutation_string_asArraylist {

    static ArrayList<String> permutationList(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> ans = new ArrayList<>();

        for (int i = 0; i <= p.length(); i++) {
            String first = p.substring(0, i);
            String second = p.substring(i,p.length());
            ans.addAll(permutationList(first + ch + second, up.substring(1)));
        }
        return ans;
    }

    public static void main(String[] args) {
        ArrayList<String> result = permutationList("","abc");
        System.out.println(result);
    }
}
