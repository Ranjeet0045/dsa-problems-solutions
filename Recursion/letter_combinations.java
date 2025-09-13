package Recursion;

import java.util.ArrayList;
import java.util.List;

public class letter_combinations {

    static ArrayList<String> combinationList(String p,String up){

        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        int digits = up.charAt(0) - '0';  // convert 'x' -> x
        ArrayList<String> ans = new ArrayList<>();
        
        int start = ((digits-2)*3);
        int end = ((digits-1)*3);
        if(digits == 7){
            end = end+1;
        }
        else if(digits == 8){
            start += 1;
            end += 1;
        }
        else if(digits == 9){
            start += 1;
            end += 2;
        }

        for (int i = start; i < end; i++) {
            char ch = (char)('a' + i);
            ans.addAll(combinationList(p+ch, up.substring(1)));
        }
        return ans;
    }

    // static void combination(String p,String up){
    //     if(up.isEmpty()){
    //         System.out.print(p + " ");
    //         return;
    //     }
    //     int digits = up.charAt(0) - '0';  // convert 'x' -> x

    //     for (int i = ((digits-2)*3); i < ((digits-1)*3); i++) {
    //         char ch = (char)('a' + i);
    //         combination( p+ch, up.substring(1));
    //     }
    // }

    // Passing single argument

    static List<String> letterCombinations(String digits){
        return combinationList("",digits); 
    }

    public static void main(String[] args) {
        String str = "9";
        List<String> result = letterCombinations(str);
        System.out.println(result);
    }
}
