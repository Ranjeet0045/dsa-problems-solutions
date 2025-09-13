public class Pangram_Sentence {

    static boolean checkIfPangram(String sentence){
        sentence = sentence.toLowerCase(); // Make sure it's lowercase
        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (sentence.indexOf(ch) == -1) {
                return false; // If any letter is missing, not a pangram
            }
        }
        return true; // All letters are present
    }

    public static void main(String[] args) {
        String sentence= "jwtucoucmdfwxxqnxzkaxoglszmfrcvjoiunqqausaxxaaijyqdqgvdnqcaihwilqkpivenpnekioyqujrdrovqrlxovcucjqzjsxmllfgndfprctxvxwlzjtciqxgsxfwhmuzqvlksyuztoetyjugmswfjtawwaqmwyxmvo";
        boolean ans = checkIfPangram(sentence);
        System.out.println(ans);
    }
}
