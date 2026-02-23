package Hashmap;

import java.util.HashMap;

public class Task_schedular_2 {

    private static long taskSchedulerII(int[] tasks, int space) {
        HashMap<Integer, Long> map = new HashMap<>();

        long time = 0;
        for(int i=0; i<tasks.length; i++){
            int curr = tasks[i];

            if(map.containsKey(curr)){
                long next = map.get(curr) + space + 1;

                if(time < next){
                    time = next; //jump forward
                }
            }
            map.put(curr, time);
            time++;
        }
        
        return time;
    }
    public static void main(String[] args) {
        int[] tasks = {1,2,1,2,3,1};
        int space = 3;
        System.out.println(taskSchedulerII(tasks, space));
    }
}
