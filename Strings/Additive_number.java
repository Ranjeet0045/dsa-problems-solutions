public class Additive_number {

    public static boolean isAdditiveNumber(String num) {
        int n = num.length();

        for (int i=1; i<=n-2; i++) {
            String a = num.substring(0, i);
            if (a.length()>1 && a.charAt(0) == '0') break;

            for (int j=i+1; j<=n-1; j++) {
                String b = num.substring(i, j);
                if (b.length()>1 && b.charAt(0) == '0') break;

                long x = Long.parseLong(a);
                long y = Long.parseLong(b);
                int idx = j;

                while(idx < n) {
                    long sum = x + y;
                    String s = String.valueOf(sum);

                    if (!num.startsWith(s, idx)) {
                        break;
                    }

                    idx += s.length();
                    x = y;
                    y = sum;
                }

                if (idx == n) return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String num = "199100199";
        System.out.println(isAdditiveNumber(num));
    }
}
