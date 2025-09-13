package Linear_Search;

public class CountEvenNumOfDigits {
    public static void main(String[] args) {
        int[] arr = {322, 44, 45, 7145, 45562, 2242, 892746, 325};
        int even = 0;

        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            int Count = 0;

            while (num != 0) {
                num /= 10;
                Count++;
            }

            if (Count % 2 == 0) {
                even++;
            }
        }

        System.out.println("Total numbers with even number of digits: " + even);
    }
}
