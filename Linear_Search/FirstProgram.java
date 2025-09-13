package Linear_Search;

public class FirstProgram {

    static int linearSearch(int[] arr,int target){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,5,67,54,32,12};
        int target = 32;
        int ans = linearSearch(arr,target);
        System.out.print(ans);
    }
}
