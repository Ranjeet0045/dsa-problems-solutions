

public class Largest_Element {

    static int large(int[] arr){
        int smax = arr[0];
        for (int i = 0; i < arr.length; i++) {
            
            if(arr[i]>smax){
                smax=arr[i];
            }
            
        }
        System.out.println("Maximum element is : " + smax);
        return 0;
    }

    public static void main(String[] args) {
        int[] arr={433,253,766,78,98,12};
        large(arr);
    }
}
