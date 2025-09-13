
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Count_Matching_Rule {

    // int ans = 0;
    // int keyIndex = 0;

    // if (ruleKey.equals("type")) {
    //     keyIndex = 0;
    // } else if (ruleKey.equals("color")) {
    //     keyIndex = 1;
    // } else {
    //     keyIndex = 2;
    // }

    // for (int i = 0; i < items.size(); i++) {
    //     if (items.get(i).get(keyIndex).equals(ruleValue)) {
    //         ans++;
    //     }
    // }
    // return ans;

    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int ans = 0;
        for (List<String> item : items) {
            if(ruleKey.equals("type") && item.get(0).equals(ruleValue)){
                ans++;
            }
            else if(ruleKey.equals("color") && item.get(1).equals((ruleValue))){
                ans++;
            }
            else if(ruleKey.equals("name") && item.get(2).equals(ruleValue)){
                ans++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        List<List<String>> items = new ArrayList<>();
        items.add(Arrays.asList("phone", "blue", "pixel"));
        items.add(Arrays.asList("computer", "silver", "lenovo"));
        items.add(Arrays.asList("phone", "gold", "iphone"));
        String ruleKey = "color";
        String ruleValue = "silver";
        //Creating java class to call non-static methods also known as objects in java
        Count_Matching_Rule obj = new Count_Matching_Rule();
        int ans = obj.countMatches(items, ruleKey, ruleValue);
        System.out.println(ans);
    }
}
