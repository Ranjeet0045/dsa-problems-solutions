public class Largest_Combination {

    public static int largestCombination(int[] candidates) {
        int maxCount = 0;

        for(int i=0; i<candidates.length; i++){
            int currCount = 1;
            int curr = candidates[i];

            int j = i+1;
            while(j < candidates.length){
                if((curr & candidates[j]) != 0){
                    currCount++; 
                    curr = curr & candidates[j];
                }
                j++;
            }
            maxCount = Math.max(maxCount,currCount);
        }

        return maxCount;
    }

    public static void main(String[] args) {

        int[] arr = {33,93,31,99,74,37,3,4,2,94,77,10,75,54,24,95,65,100,41,82,35,65,38,49,85,72,67,21,20,31};
        System.out.println(largestCombination(arr));

    }
}
