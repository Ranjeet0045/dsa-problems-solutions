import java.util.Scanner;

public class findRemaining {

    static String findSpark(String str, String spark) {
        StringBuilder sb = new StringBuilder(str);
        boolean find = true;

        while (find) {
            find = false; // assume nothing is found
            int i = 0, j = 0;

            while (i < sb.length()) {
                if (sb.charAt(i) == spark.charAt(j)) {
                    j++;
                    i++;
                    if (j == spark.length()) {
                        // full spark found, remove it
                        sb.delete(i - j, i);
                        find = true;
                        break; // restart scanning
                    }
                } else {
                    if (j > 0) {
                        // mismatch after partial match → reset j
                        j = 0;
                    } else {
                        i++;
                    }
                }
            }
        }

        return sb.length() == 0 ? "FRULA" : sb.toString();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str = in.nextLine();
        System.out.print("Enter the sparked string : ");
        String spark = in.nextLine();

        String result = findSpark(str, spark);
        System.out.println(result);

        in.close();
    }
}
