

import java.util.Scanner;

public class Unique_Element {

static void Unique(int[] arr){

    for(int i = 0; i < arr.length; i++){
        for(int j = i+1;j < arr.length; j++){
            if( arr[i] == arr[j] ){
                arr[i] = -1;
                arr[j] = -1;
            }
        }
    }

    int ans = -1;
    for (int i = 0; i < arr.length; i++) {
        if(arr[i]>0){
            ans = arr[i];
        }
        
    }
    System.out.print("Unique element is :" + ans);
    
}


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter size of array :");
        int x = in.nextInt();
        System.out.print("Enter elements :");
        int[] arr = new int[x];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        Unique(arr);
        in.close();
    }
}
