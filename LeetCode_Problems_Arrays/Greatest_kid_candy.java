
import java.util.ArrayList;
import java.util.List;


public class Greatest_kid_candy {

    static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> boolList = new ArrayList<>();
        for (int i = 0; i < candies.length; i++) {
            int max;
            max = candies[i] + extraCandies;
            int temp = max;
            for (int j = 0; j < candies.length; j++) {
                if(candies[j]>max){
                    max = candies[j];
                }
            }
            if(max==temp){
                boolList.add(true);
            }
            else{
                boolList.add(false);
            }
        }
        return boolList;
    }

    public static void main(String[] args) {
        int[] arr = {4,2,1,1,2};
        int extra = 1;
        ArrayList<Boolean> list = (ArrayList<Boolean>) kidsWithCandies(arr,extra);
        System.out.println(list);
    }
}
