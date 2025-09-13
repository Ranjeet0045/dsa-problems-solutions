public class Candy {

    static int candy(int[] ratings){
        int n = ratings.length;
        int[] candies = new int[n];

        for (int i = 0; i < ratings.length; i++) {
            candies[i] = 1;
        }
        for (int i = 1; i < ratings.length; i++) {
            if(ratings[i] > ratings[i-1]){
                candies[i] = candies[i-1] + 1;
            }
        }
        for (int i = ratings.length-2; i >= 0; i--) {
            if(ratings[i] > ratings[i+1]){
                candies[i] = Math.max(candies[i], candies[i + 1] + 1);
            }
        }
        int total = 0;
        for (int i = 0; i < candies.length; i++) {
            total += candies[i];
        }
        return total;
    }

    public static void main(String[] args) {
        int[] ratings = {1,2,2};
        int ans = candy(ratings);
        System.out.println(ans);
    }
}
