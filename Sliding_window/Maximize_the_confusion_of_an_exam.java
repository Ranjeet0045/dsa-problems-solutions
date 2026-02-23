package Sliding_window;

public class Maximize_the_confusion_of_an_exam {

    public static int maxConsecutiveAnswers(String answerKey, int k) {
        int n = answerKey.length();
        int maxLen = 0;
        int tCount = 0, fCount = 0;
        int l = 0;

        for(int r=0; r<n; r++){
            if(answerKey.charAt(r) == 'T'){
                tCount++;
            }
            else{
                fCount++;
            }

            while(Math.min(tCount, fCount) > k){
                if(answerKey.charAt(l) == 'T'){
                    tCount--;
                }
                else{
                    fCount--;
                }
                l++;
            }
            maxLen = Math.max(maxLen, r-l+1);
        }
        return maxLen;
    }
    public static void main(String[] args) {
        String answerKey = "TTFTTFTT";
        int k = 1;
        int ans = maxConsecutiveAnswers(answerKey, k);
        System.out.println(ans);
    }
}
