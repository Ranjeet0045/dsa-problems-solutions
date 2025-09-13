package Recursion;

public class Skip_character {

    static void skip(String str1,String str2){
        if(str2.isEmpty()){
            System.out.println(str1);
            return;
        }
        char ch = str2.charAt(0);
        if(ch == 'a'){
            skip(str1,str2.substring(1));
        }
        else{
            skip(str1+ch,str2.substring(1));
        }
    }

    public static void main(String[] args) {
        // String str = "paraiaya";
        skip("" ,"paraiaya");
    }
}
