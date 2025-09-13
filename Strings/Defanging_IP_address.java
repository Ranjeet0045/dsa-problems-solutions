
public class Defanging_IP_address {

    static String defangIPaddr(String address){
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < address.length(); i++) {
            char c = address.charAt(i);
            if(c == '.'){
                ans.append("[.]");
            }
            else{
                ans.append(c);
            }
        }
        // return address.replace(".", "[.]");
        return ans.toString();
    }

    public static void main(String[] args) {
        String s = "255.100.50.0";
        String ans = defangIPaddr(s);
        System.out.println(ans);
    }
}
