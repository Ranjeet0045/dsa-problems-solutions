package Recursion;


public class Decode_String {

// Set<Integer> set = new HashSet<>(Arrays.asList(2, 3, 4, 5, 6, 7, 8, 9));


    static String Solve(String str,int n,int[] idx){

        StringBuilder sb = new StringBuilder();

        while(idx[0] < n){
            char current = str.charAt(idx[0]);
        
            if (Character.isDigit(current)) {
                // Read full number (like 100)
                int num = 0;
                while (idx[0] < n && Character.isDigit(str.charAt(idx[0]))) {
                    num = num * 10 + (str.charAt(idx[0]) - '0');
                    idx[0]++;
                }
                if(str.charAt(idx[0]) == '['){
                    idx[0]++;
                    String temp = Solve(str,n,idx);
                    idx[0]++;
                    for(int i=0; i<num; i++){
                        sb.append(temp);
                    }
                }
            }
            else if(current == ']'){
                return sb.toString();
            }
        else{
            sb.append(current);
                idx[0]++;
        }
    }
        return sb.toString();
    }

    static String decodeString(String s){
        int[] idx = new int[1];
        return Solve(s,s.length(),idx);
    }
    public static void main(String[] args) {
        String str = "100[Leetcode]";
        String ans = decodeString(str);
        System.out.println(ans);
    }
}
