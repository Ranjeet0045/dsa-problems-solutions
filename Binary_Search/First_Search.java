package Binary_Search;

public class First_Search {
    public static void main(String[] args) {
        int[] arr = {1,2,3,12,23,45,67,89,90};
        int target = 45;
        int ans = searchTarget(arr,target);
        System.out.println(ans);
    }

    static int searchTarget(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(target<arr[mid]){
                end = mid-1;
            }
            else if(target>arr[mid]){
                start=mid+1;
            }
            else{
                System.out.print("Present at index : ");
                return mid;
            }
        }
        return -1;
    }  
}
