

public class AdditionOfArrays{
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4};
        int[] arr2 = {1,2,3,4};
        int n = arr1.length;//Since both arrays have same length
        int[] result = new int[n];
        for(int i=0;i<n;i++){
            result[i] = arr1[i] + arr2[i];
        }
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
       