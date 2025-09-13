package Binary_Search;


public class CeilingOfCharacter {

    static int ceiling(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        int N = arr.length;
        while(start<=end){
            int mid = (start+end)/2;
            if(target<arr[mid]){
                end = mid-1;
            }
            else if(target>arr[mid]){
                start = mid + 1;
            }
            else{
                System.out.print("Ceiling index is : ");
                return mid;
            }
        }
        System.out.print("Ceiling index is : ");
        return start % N;
    }

    public static void main(String[] args) {
       int[] arr = {'a','b','c','d','f','g','j','k','m'}; 
       int target = 'e';
       int ans = ceiling(arr,target);
       System.out.println(ans);
    }
}
