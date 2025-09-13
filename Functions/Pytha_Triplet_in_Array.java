package Functions;

public class Pytha_Triplet_in_Array {

    static boolean triplet(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                for (int k = j+1; k < arr.length; k++) {
                    int x = arr[i]*arr[i];
                    int y = arr[j]*arr[j];
                    int z = arr[k]*arr[k];

                    if(x==y+z || y==x+z || z==x+y){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = {2,3,4,7,5};
        boolean ans = triplet(arr);
        System.out.println(ans);
    }
}
