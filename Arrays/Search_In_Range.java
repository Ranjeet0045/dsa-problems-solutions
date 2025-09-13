

public class Search_In_Range {
    public static void main(String[] args) {
        int[] arr = {23,45,67,8,9,65,32};
        int target = 32;
        System.out.println(linearSearch(arr,target,0,4));
    }

    static int linearSearch(int[] arr,int target,int start,int end){
        int count=0;
        int index = -1;
        for (int i = start; i <=end; i++) {
            if(arr[i]==target){
              count++;
              index = i;
            }
        }
        if(count==1){
            System.out.print("Number is present in given range at index:");
        }else{
            System.out.println("Number is not present in given range.");
        }
        return index;
    }
}

