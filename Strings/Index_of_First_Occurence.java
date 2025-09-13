public class Index_of_First_Occurence {

    static boolean compare(String haystack, String needle, int idx){
        int n1 = haystack.length();
        int n2 = needle.length();
        for (int i = 0; i < n2; i++) {
            if(idx >= n1) return false;
            if(haystack.charAt(idx) != needle.charAt(i)){
                return false;
            }
            idx++;
        }
        return true;
    }

    static int strstr(String haystack, String needle){
        int n1 = haystack.length();
        for (int i = 0; i < n1; i++) {
            if(haystack.charAt(i) == needle.charAt(0)){
                if(compare(haystack,needle,i) == true){
                    return i;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String haystack = "sadbutsad";
        String needle = "but";
        int ans = strstr(haystack,needle);
        System.out.println(ans);
    }
}
