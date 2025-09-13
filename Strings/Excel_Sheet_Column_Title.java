public class Excel_Sheet_Column_Title {

    static String convertToTitle(int n){
        StringBuilder sb = new StringBuilder();
        while(n > 0) {
            n--; // Shifting to zero based indexing
            int rem  = n % 26;
            int newRem = rem + 65;
            for (int j = 'A'; j <= 'Z'; j++) {
                if(newRem == j){
                    char ch = (char)newRem;
                    sb.append(ch);
                }
                
            }
            n = n/26;
        }
        // StringBuilder sb = new StringBuilder();
        // while(n > 0) {
        //     n--;
        //     int rem  = n % 26;
        //     char ch = (char)(rem + 65);
        //     sb.append(ch);
        //     n = n/26;
        // }
        // String ans = new StringBuilder(sb).reverse().toString();
        // return ans;   
        String ans = new StringBuilder(sb).reverse().toString();
        return ans;
    }

    public static void main(String[] args) {
        int colNum = 26;
        String ans = convertToTitle(colNum);
        System.out.println(ans);
    }
}
