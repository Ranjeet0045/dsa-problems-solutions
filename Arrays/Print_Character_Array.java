


import java.util.Arrays;

// package Linear_Search;

public class Print_Character_Array {

    static String Print_Array(String name){
        return Arrays.toString(name.toCharArray());
    }

    public static void main(String[] args) {
        String str = "RANJEET";
        String ans = Print_Array(str);
        System.out.println(ans);
    }
}
