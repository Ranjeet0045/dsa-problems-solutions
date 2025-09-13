package Recursion;

import java.util.ArrayList;
import java.util.List;

// Not working for large numbers
// Taking too much time for numbers greater than 65 

public class Perfect_Squares {

    static int minCount = Integer.MAX_VALUE;

    static void findMinSquares(List<Integer> squares, int target, int count) {
        if (target == 0) {
            minCount = Math.min(minCount, count);
            return;
        }

        for (int i = 0; i < squares.size(); i++) {
            int sq = squares.get(i);
            if (sq <= target) {
                findMinSquares(squares, target - sq, count + 1);
            }
        }
    }

    static int numSquares(int n) {
        minCount = Integer.MAX_VALUE;
        List<Integer> squareList = new ArrayList<>();

        for (int i = 1; i * i <= n; i++) {
            squareList.add(i * i);
        }

        findMinSquares(squareList, n, 0);

        return minCount == Integer.MAX_VALUE ? -1 : minCount;
    }

    public static void main(String[] args) {
        int n = 67;
        System.out.println(numSquares(n));
    }
}
