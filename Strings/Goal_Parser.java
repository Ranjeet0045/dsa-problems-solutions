public class Goal_Parser {

    static String interpret(String command) {
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < command.length(); ) {
            if (command.charAt(i) == 'G') {
                ans.append("G");
                i++;
            } else if (command.startsWith("()", i)) {
                ans.append("o");
                i += 2;
            } else {
                ans.append("al");
                i += 4;
            }
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        String command = "G()(al)";
        String ans = interpret(command);
        System.out.println(ans);
    }
}
