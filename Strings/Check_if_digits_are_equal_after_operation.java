public class Check_if_digits_are_equal_after_operation {

    public static boolean hasSameDigits(String s) {

        if(s.length() == 2){
            if(s.charAt(0) == s.charAt(1)){
                return true;
            }
            return false;
        }
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder(s);
        
        while(sb1.length() != 2){

            for(int i=0; i<sb2.length()-1; i++){
                int num = ((sb2.charAt(i)-'0') + (sb2.charAt(i+1)-'0')) % 10;
                sb1.append(num);
            }
            if(sb1.length() == 2){
                if(sb1.charAt(0) == sb1.charAt(1)){
                    return true;
                }
            }
            else{
                sb2.setLength(0);
                sb2.append(sb1);
                sb1.setLength(0);
            }
        }
        
        return false;
    }
    public static void main(String[] args) {
        String s = "34789";
        boolean ans = hasSameDigits(s);
        System.out.println(ans);
    }
}
