package TwoPointer_Approach;

public class Sort0sAnd1s_M1 {
    public static void main(String[] args) {
        int[] arr = {0,0,1,0,1,1,0};
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 0){
                count++;
            }
        }
        System.out.println(count);
        for (int i = 0; i < arr.length; i++) {
            if(i<count){
                arr[i] = 0;
            }
            else{
                arr[i] = 1;
            }
        }
        
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
