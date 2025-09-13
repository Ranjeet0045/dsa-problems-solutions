package Recursion;

import java.util.ArrayList;

public class Find_winner_of_Circular_Game {

    static int helper(ArrayList<Integer> list,int k,int i){
        if(list.size() == 1){
            return (int)list.get(0);
        }
        i = (i + k - 1) % list.size();
        list.remove(i);
        System.out.println(list.size());
        System.out.println(list);

        return helper(list,k,i);
    }

    static int findTheWinner(int n, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }
        System.out.println(list);
        int ans = helper(list,k,0 );
        return ans;
    }

    public static void main(String[] args) {
        int n = 6;
        int k = 5;
        int ans = findTheWinner(n,k);
        System.out.println(ans);
    }
}
