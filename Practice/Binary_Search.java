public class Binary_Search {
    public static void main(String[] args) {
        int[] arr = {11,22,33,47,59,67,73,80,92};

        int target = 80;
        int left = 0;
        boolean found = false;
        int right = arr.length-1;
        while(left <= right){
            int mid = left + (right - left)/2;
            if(arr[mid] == target){
                System.out.println("Present");
                found = true;
                break;
            }
            if(arr[mid] > target){  
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }
        }
        if(!found){
            System.out.println("Not present...");
        }
    }
}
