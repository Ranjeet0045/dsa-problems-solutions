

public class ArrayFromPermutation {

    static int[] buildArray(int[] perm){
        int n = perm.length;
        int[] result = new int[n];
        for(int i=0;i<n;i++){
            result[perm[i]] = i;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] perm = {2, 0, 1, 3};
        int[] result = buildArray(perm);
        for (int num : result){
            System.out.print(num + " ");
        }
    }
}
