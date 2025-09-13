

public class MajorityElement {
    //Element which comes more than n/2 times

    static int majElement(int[] arr){
        for (int i = 0; i < arr.length; i++) {      //This part has O(n^2) time complexity
            for (int j = 1; j < arr.length-i; j++) {
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
               }
            } 
        }
        int midIndex = arr.length/2;
        System.out.print("Majority element is : ");
        return arr[midIndex];
    }

    //This part has O(n) and O(1) of time and space complexity
    //     public int majorityElement(int[] nums) {
    //         int candidate = nums[0], count = 0;
    
    //         // Phase 1: Find a candidate        
    //         for (int num : nums) {
    //             if (count == 0) {
    //                 candidate = num;
    //             }
    //             count += (num == candidate) ? 1 : -1;
    //         }
    
    //         // Phase 2: Verify the candidate (optional for problem assumption)
    //         return candidate;
    //     }

    

    public static void main(String[] args) {
        int[] arr = {2,2,1,1,1,2,2,3,3,3,3,3,3,3};
        int ans = majElement(arr);
        System.out.println(ans);
    }
}
