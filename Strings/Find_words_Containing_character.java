import java.util.List;
import java.util.ArrayList;

class Find_words_Containing_character{

    static List<Integer> findWordsContaining(String[] words,char x){
        List<Integer> list = new ArrayList<>();
        int i = 0;
        while(i < words.length){
            String temp = words[i];
            int j = 0;
            while(j < temp.length()){
                if(temp.charAt(j) == (x)){
                    list.add(i);
                    break;
                }
                j++;
            }
            i++;
        }

        return list;
    }

    public static void main(String[] args) {
        String[] words = {"abc","bcd","aaaa","cbc"};
        char x = 'a';
        List<Integer> list = findWordsContaining(words,x);
        System.out.println(list);
    }
}