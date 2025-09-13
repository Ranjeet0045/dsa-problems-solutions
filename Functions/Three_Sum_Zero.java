package Functions;

public class Three_Sum_Zero {

    static boolean triplet(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                for (int k = 0; k < arr.length; k++) {
                    int x = arr[i];
                    int y = arr[j];
                    int z = arr[k];
                    if((x+y+z)==0){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = {-1,1,0,5,6};
        boolean ans = triplet(arr);
        System.out.println(ans);
    }
}
