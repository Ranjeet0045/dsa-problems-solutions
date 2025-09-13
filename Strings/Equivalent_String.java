public class Equivalent_String {

    static boolean arrayStringsAreEqual(String[] word1,String[] word2){
        boolean ans = false;
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for (String word11 : word1) {
            sb1.append(word11);
        }
        for (String word21 : word2) {
            sb2.append(word21);
        }
        if(sb1.toString().equals(sb2.toString())){
            ans = true;
        }
        return ans;
    }

    public static void main(String[] args) {
        String[] word1 = {"abc","d","defg"};
        String[] word2 = {"abcddef"};
        boolean ans = arrayStringsAreEqual(word1,word2);
        System.out.println(ans);
    }
}
