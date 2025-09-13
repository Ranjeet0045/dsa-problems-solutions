package LeetCodeDailyQuestions;


public class August_6 {

    static int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int count = 0;

        //  METHOD 1 -> Inefficient due to large constraints...

        for(int i=0; i<fruits.length; i++){
            for(int j=0; j<baskets.length; j++){
                if(fruits[i] <= baskets[j]){
                    count++;
                    baskets[j] = -1;
                    break;
                }
            }
        }

        return baskets.length - count;

        //  METHOD 2 

            
    }

    public static void main(String[] args) {
        int[] fruits = {4,2,5};
        int[] baskets = {3,5,4};

        int ans = numOfUnplacedFruits(fruits,baskets);
        System.out.println(ans);
    }
}
