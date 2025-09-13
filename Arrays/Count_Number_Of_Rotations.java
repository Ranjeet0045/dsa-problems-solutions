

public class Count_Number_Of_Rotations {

    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid - 1]){
                return mid - 1;
            }
            if(arr[start] > arr[mid]){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return -1;
    }

    static int Count_rotations(int[] arr){
        int start = 0;
        int end  =arr.length - 1;
        if(arr[start] < arr[end]){
            System.out.println("Array is not rotated");
        }
        else{
            int pivot = findPivot(arr);
            return pivot + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {18,2,3,6,12,15};
        int ans = Count_rotations(arr);
        System.out.println(ans);
    }
}