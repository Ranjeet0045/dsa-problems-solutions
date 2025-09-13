public class Linear_Search {
    public static void main(String[] args) {
        int[] arr = {2,5,9,3,4,6,1};
        int target = 4;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target){
                System.out.println("Found at index : " + i);
                break;
            }
            if(i == arr.length-1){
                System.out.println("Not present...");

            }
        }
    }
}