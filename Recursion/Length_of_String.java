package Recursion;

public class Length_of_String {

    public static int find(String str,int index){
        if(index == str.length()){
            return 0;
        }
        return 1 + find(str,index+1);
    }

    public static int lengthString(String str) {
        int ans = find(str,0);
        return ans;
    }

    public static void main(String[] args) {
        String str = "Hello";
        int ans = lengthString(str);
        System.out.println(ans);
    }
}
