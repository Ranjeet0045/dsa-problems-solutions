public class CountAndSay {
    static String countAndSay(int n) {
        if (n == 1) {
            return "1";
        }
        String say = countAndSay(n - 1);
        StringBuilder result = new StringBuilder();
        int count = 1;
        for (int i = 1, len = say.length(); i < len; i++) {
            if (say.charAt(i) == say.charAt(i - 1)) {
            count++;
            } else {
            result.append(count).append(say.charAt(i - 1));
            count = 1;
            }
        }
        result.append(count).append(say.charAt(say.length() - 1));
        return result.toString();
    }
    public static void main(String[] args) {
        int n = 4;
        String ans = countAndSay(n);
        System.out.println(ans);
    }
}
