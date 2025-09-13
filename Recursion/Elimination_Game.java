package Recursion;

import java.util.ArrayList;
import java.util.List;

public class Elimination_Game {

    static int helper(List<Integer> list,boolean leftToRight){
        if(list.size() == 1){
            return list.get(0);
        }
        List<Integer> newList = new ArrayList<>();
        if(leftToRight){
            for(int i=1; i<list.size(); i+=2){
                newList.add(list.get(i));
            }
        }
        else{
            int start = (list.size() % 2 == 0) ? 0 : 1;
            for (int i = start; i < list.size(); i += 2) {
                newList.add(list.get(i));
            }
        }
        return helper(newList, !leftToRight);
    }

    static int lastRemaining(int n) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }
        int ans = helper(list,true);    
        return ans;
    }

    public static void main(String[] args) {
        int n = 9;
        int ans = lastRemaining(n);
        System.out.println(ans);
    }
}
