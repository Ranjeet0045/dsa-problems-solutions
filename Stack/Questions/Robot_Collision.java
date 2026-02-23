package Stack.Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Robot_Collision {

    static class Robot implements Comparable<Robot>{
        int pos;
        int health;
        char dir;
        int idx;

        public Robot(int pos, int health, char dir, int idx){
            this.pos = pos;
            this.health = health;
            this.dir = dir;
            this.idx = idx;
        }

        public int compareTo(Robot r){
            return this.pos - r.pos;
        }
    }

    public static List<Integer> survivedRobotsHealths(int[] positions, int[] healths, String directions) {
        int n = directions.length();
        Robot[] arr = new Robot[n];
        for(int i=0; i<n; i++){
            arr[i] = new Robot(positions[i], healths[i], directions.charAt(i), i);
        }
        Arrays.sort(arr);
        Stack<Robot> st = new Stack<>();

        for(int i=0; i<n; i++){
            Robot curr = arr[i];
            if(curr.dir == 'R'){
                st.push(curr);
            }
            else{
                while(!st.isEmpty() && st.peek().dir == 'R' && curr.health > 0){
                    Robot top = st.peek();

                    if(top.health < curr.health){
                        st.pop();
                        curr.health--;
                    }
                    else if(top.health > curr.health){
                        top.health--;
                        curr.health = 0;
                    }
                    else{
                        st.pop();
                        curr.health = 0;
                    }
                }
                if(curr.health > 0){
                    st.push(curr);
                }
            }
        }
        int[] ans = new int[n];
        Arrays.fill(ans, -1);

        while(!st.isEmpty()){
            Robot r = st.pop();
            ans[r.idx] = r.health;
        }

        List<Integer> res = new ArrayList<>();
        for(int i=0; i<n; i++){
            if(ans[i] != -1) res.add(ans[i]);
        }

        return res;
    }
    public static void main(String[] args) {
        int[] positions = {3,5,2,6};
        int[] healths = {10,10,15,12};
        String directions = "RLRL";

        List<Integer> ans = survivedRobotsHealths(positions, healths, directions);
        System.out.println(ans);
    }
}
