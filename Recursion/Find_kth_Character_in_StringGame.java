package Recursion;

public class Find_kth_Character_in_StringGame {

    static char findChar(int k,StringBuilder str){
        if(str.length() >= k){
            System.out.println(str);
            return str.charAt(k-1);
        }
        // StringBuilder gntd = new StringBuilder();
        StringBuilder ans = new StringBuilder(str);
        for(int i=0; i<str.length(); i++){
            int temp = str.charAt(i);
            if(temp == 122){
                temp = 97;
            }
            temp += 1;
            char formed = (char)(temp);
            ans.append(formed); 
        }
        // ans.append();
        return findChar(k,ans);
    }

    static char kthCharacter(int k) {
        StringBuilder str = new StringBuilder("a");
        char result = findChar(k,str);
        return result;
    }

    public static void main(String[] args) {
        int k = 5;
        char ans = kthCharacter(k);
        System.out.println(ans);  
    }
}
