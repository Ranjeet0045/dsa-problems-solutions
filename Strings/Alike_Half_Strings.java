public class Alike_Half_Strings {

    static boolean halvesAreAlike(String s){
        // boolean ans = false;
        // StringBuilder sb1 = new StringBuilder();
        // StringBuilder sb2 = new StringBuilder();
        // for(int i=0,j=n/2; i<n/2 && j<n; i++,j++){
        //     sb1.append(s.charAt(i));
        //     sb2.append(s.charAt(j));
        // // }
        // sb1.append((s.substring(0, n/2)));
        // sb2.append((s.substring(n/2, n)));
        int n = s.length();
        char[] arr = {'a','e','i','o','u','A','E','I','O','U'};
        int count1 = 0, count2 = 0;
        for(int i=0,j=n/2; i<n/2 && j<n; i++,j++){
            for (int k = 0; k < arr.length; k++) {
                if(s.charAt(i) == arr[k]){
                    count1++;
                }
                if(s.charAt(j) == arr[k]){
                    count2++;
                }
            }
        }
        return count1 == count2;
    }

    public static void main(String[] args) {
        String s = "book";
        boolean ans = halvesAreAlike(s);
        System.out.println(ans);
    }
}
