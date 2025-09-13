import java.util.Arrays;;
public class Median {

     static int[] merge(int arr[], int left, int mid, int right) {
        // Sizes of two subarrays
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // Temporary arrays
        int[] L = new int[n1];
        int[] R = new int[n2];

        // Copy data to temporary arrays
        for (int i = 0; i < n1; i++)
            L[i] = arr[left + i];
        for (int j = 0; j < n2; j++)
            R[j] = arr[mid + 1 + j];

        // Merge the temporary arrays

        int i = 0, j = 0;
        int k = left;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of L[]
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        // Copy remaining elements of R[]
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
        return arr;
    }
    static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;

            // Sort left half
            mergeSort(arr, left, mid);
            // Sort right half
            mergeSort(arr, mid + 1, right);

            // Merge sorted halves
            merge(arr, left, mid, right);
        }
    }

    static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double median = -1;
        int m = nums1.length;
        int n = nums2.length;
        int[] ans = new int[m+n];
        int j = 0;
        for(int i=0;i<m;i++){
            ans[j] = nums1[i];
            j++;
        }
        for(int i=0;i<n;i++){
            ans[j] = nums2[i];
            j++;
        }
        mergeSort(ans, 0, ans.length - 1);
        System.out.println(Arrays.toString(ans));
        if(ans.length % 2 != 0){
            int idx = ans.length/2;
            median = ans[idx];
        }
        if(ans.length % 2 == 0){
            int idx = ans.length/2;
            median = (double)(ans[idx-1] + ans[idx])/2;
        }
        return median;
    }
    
    public static void main(String[] args) {
        int[] nums1 = {1,2};
        int[] nums2 = {3};
        double ans = findMedianSortedArrays(nums1,nums2);
        System.out.println(ans);
    }
}
