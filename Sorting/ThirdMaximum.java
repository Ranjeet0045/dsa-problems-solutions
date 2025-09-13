

public class ThirdMaximum {

    static int firstmax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    static int secmax(int[] arr, int max) {
        int smax = Integer.MIN_VALUE;
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > smax && arr[i] < max) {
                smax = arr[i];
                found = true;
            }
        }
        if (found) {
            return smax;
        } else {
            return max;
        }
    }

    static int findthirdmax(int[] arr, int max, int smax) {
        int tmax = Integer.MIN_VALUE;
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > tmax && arr[i] < smax) {
                tmax = arr[i];
                found = true;
            }
        }
        if (found) {
            return tmax;
        } else {
            return smax;
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 9, 8, 6};
        int max = firstmax(arr);
        int smax = secmax(arr, max);
        int tmax = findthirdmax(arr, max, smax);
        System.out.print("Third maximum element is: " + tmax);
    }
}
