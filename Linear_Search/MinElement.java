package Linear_Search;

public class MinElement {

    static int minElement(int[] arr){
        int n = arr.length;
        int min = arr[0];
        for (int i = 0; i < n; i++) {
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.print("Minimum element is : ");
        return min;
    }

    public static void main(String[] args) {
        int[] arr = {43,45,36,21,12,24,98,60,70};
        int x = minElement(arr);
        System.out.print(x);
    }
}
