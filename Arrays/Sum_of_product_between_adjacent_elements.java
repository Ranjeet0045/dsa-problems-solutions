import java.util.ArrayList;
import java.util.List;

public class Sum_of_product_between_adjacent_elements {

    public static int numberOfBeams(String[] bank) {
        int ans = 0;
        int n = bank.length;
        List<Integer> list = new ArrayList<>();
        
        for(int i=0; i<n; i++){
            String str = bank[i];
            int count = 0;

            for(int j=0; j<str.length(); j++){
                if(str.charAt(j) == '1'){
                    count += 1;
                }
            }
            if(count != 0) list.add(count);
        }

        for(int i=0; i<list.size()-1; i++){
            ans += list.get(i)*list.get(i+1);
        }

        return ans;
    }
    public static void main(String[] args) {
        String[] bank = {"011001","000000","010100","001000"};
        int ans = numberOfBeams(bank);
        System.out.println(ans);
    }
}
