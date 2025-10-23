package Greedy;

import java.util.HashMap;

public class Rabits_in_forest {

    public static int numRabbits(int[] answers) {
        int count = 0;
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0; i<answers.length; i++){
            map.put(answers[i],map.getOrDefault(answers[i],0)+1);
        }
        for(int num : map.keySet()){
            if(num == 0){
                int x = map.get(num);
                count += x;
            }
            else{
                int x = map.get(num);
                int groupSize = num + 1;
                int groups = (x + groupSize - 1) / groupSize; // ceil division
                count += groups * groupSize;
            }
        }

        return count;
    }
    public static void main(String[] args) {
        int[] answers = {0,0,1,1,1,2};
        int ans = numRabbits(answers);
        System.out.println(ans);
    }
}
