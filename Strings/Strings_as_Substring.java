public class Strings_as_Substring {

    static int numsOfStrings(String[] patterns,String word){
        int ans = 0;
        for (String pattern : patterns) {
            if (word.contains(pattern)) {
                ans++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String[] patterns = {"zbnu","zbn","dp","zbnur","nur","mugo","qx","r","bn","rdq","u"};
        String word = "zbnur";
        int ans = numsOfStrings(patterns,word);
        System.out.println(ans);
    }
}
