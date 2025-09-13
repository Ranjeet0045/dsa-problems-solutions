package Recursion;

import java.util.ArrayList;

class Dice_rolls_with_targetSum{

    // Inefficient due to very extra space and time limit will be exceeded;

    // static int numRollsToTarget(int dice, int faces, int target) {
    //     if(target < 0) return 0;
    //     if (dice == 0) {
    //         return target == 0 ? 1 : 0;
    //     }
    //     int mod = 1000000007;
    //     int count = 0;
    //     for (int i = 1; i <= faces && i<= target; i++) {
    //         count += numRollsToTarget(dice-1,faces, target-i);
    //     }
    //     return (count % mod);
    // } 

    // Code to return all possible combinations using Arraylist

    static ArrayList<String> dice(String p,int target,int faces){
        if(target == 0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        
        ArrayList<String> ans = new ArrayList<>();
        for (int i = 1; i <= faces && i<= target; i++) {
            ans.addAll(dice(p+i, target-i,faces));
        }
        return ans;
    }

    public static void main(String[] args) {
        // int dice = 30;
        // int faces = 30;
        // int target = 500; 
        // System.out.println(numRollsToTarget(dice,faces,target));
        int target = 4;
        int faces = 6;
        System.out.println(dice("",target,faces));
    }
}