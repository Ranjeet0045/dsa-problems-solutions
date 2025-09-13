package LeetCodeDailyQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class August_11 {

    static int[] productQueries(int n, int[][] queries) {
        ArrayList<Integer> list = new ArrayList<>();

        int temp = n;
        while (temp > 0) {
            int pow = 1;
            while (pow * 2 <= temp) {
                pow *= 2;
            }
            list.add(pow);
            temp -= pow;
        }

        // // Extract powers of two from n
        // int power = 1;
        // while (n > 0) {
        //     if ((n & 1) == 1) {
        //         list.add(power);
        //     }
        //     power *= 2;
        //     n >>= 1;
        // }

        Collections.sort(list);

        int MOD = 1000000007;
        int[] answers = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int product = 1;
            for (int idx = queries[i][0]; idx <= queries[i][1]; idx++) {
                product = (product * list.get(idx)) % MOD;
            }
            answers[i] = (int) product;
        }
        return answers;
    }

    public static void main(String[] args) {
        int n = 15;
        int[][] queries = {{0, 1}, {2, 2}, {0, 3}};
        int[] ans = productQueries(n, queries);
        System.out.println(Arrays.toString(ans));
    }
}
