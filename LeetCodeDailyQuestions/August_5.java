package LeetCodeDailyQuestions;

// import java.util.HashSet;

public class August_5 {

    static int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int count = 0;

        // METHOD 1 -> Not Efficient

        // HashSet<Integer> set = new HashSet<>();

        // for(int i=0; i<fruits.length; i++){
        //     for(int j=0; j<baskets.length; j++){
        //         if(fruits[i] <= baskets[j]){
        //             if(!set.contains(j)){
        //                 set.add(j);
        //                 break;
        //             }
        //         }
        //     }
        // }
        // System.out.println(set);
        // for (int i = 0; i < baskets.length; i++) {
        //     if(!set.contains(i)){
        //         count++;
        //     }
        // }

        //  METHOD 2 -> Efficient

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
    }

    public static void main(String[] args) {
        int[] fruits = {4,2,5};
        int[] baskets = {3,5,4};

        int ans = numOfUnplacedFruits(fruits,baskets);
        System.out.println(ans);
    }
}
