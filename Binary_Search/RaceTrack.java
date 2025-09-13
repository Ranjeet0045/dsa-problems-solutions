package Binary_Search;

public class RaceTrack {

    static boolean isPossible(int[] arr,int k,int dist){
        int kidsplaced = 1;
        int lastkid = arr[0];
        for(int i =1; i<arr.length; i++){
            if(arr[i] - lastkid >= dist){
                kidsplaced++;
                lastkid = arr[i];
            }
        }
        return kidsplaced >= k;
    }

    static int Racetrack(int[] arr,int k){
        if(k>arr.length) return -1;
        int start = 0;
        int end = (int)1e9;
        int ans = -1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(isPossible(arr,k,mid))//can k kids be placed such that no two kids have distance lesser than mid
            {
                ans = mid;
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return ans;
    }
    
    public static void main(String[] args) {
        int[] arr = {1,2,4,8,9};
        int k = 3;
        System.out.println(Racetrack(arr,k));
    }
}
