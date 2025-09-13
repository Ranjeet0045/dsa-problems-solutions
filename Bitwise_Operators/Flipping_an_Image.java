
import java.util.Arrays;

public class Flipping_an_Image {

    static int[][] flipandInvertImage(int[][] image){
        for (int[] row : image) {
            int j = 0;
            int k = image[0].length-1;
            while(j <= k){
                int temp = row[j] ^ 1;
                row[j] = row[k] ^ 1;
                row[k] = temp;
                j++;
                k--;
            }
        }
        return image;
    }

    public static void main(String[] args) {
        int[][] image = {{1,1,0},{1,0,1},{0,0,0}};
        int[][] ans = flipandInvertImage(image);
        System.out.println(Arrays.deepToString(ans));
    }
}
