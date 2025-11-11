package Dynamic_programming.Memorization;

import java.util.Arrays;

public class Longest_common_subsequence {

    public static int findLongest(String str1, String str2, int idx1, int idx2, int[][] dp){
        if(idx1 >= str1.length() || idx2 >= str2.length()){
            return 0;
        }

        if(dp[idx1][idx2] != -1) return dp[idx1][idx2];

        int pick = 0;
        if(str1.charAt(idx1) == str2.charAt(idx2)){
            pick = 1 + findLongest(str1, str2, idx1 + 1, idx2 + 1, dp);
        }
        int notPick1 = findLongest(str1, str2, idx1 + 1, idx2, dp);
        int notPick2 = findLongest(str1, str2, idx1, idx2 + 1, dp);

        return dp[idx1][idx2] = Math.max(pick,Math.max(notPick1, notPick2));
    }

    public static int longestCommonSubsequence(String text1, String text2) {
        int[][] dp = new int[text1.length()+1][text2.length()+1];
        for(int i=0; i<dp.length; i++){
            Arrays.fill(dp[i],-1);
        }
        
        return findLongest(text1,text2,0,0,dp);
    }
    public static void main(String[] args) {
        String text1 = "abcde", text2 = "ace" ;
        
        int ans = longestCommonSubsequence(text1,text2);
        System.out.println(ans);
    }
}
