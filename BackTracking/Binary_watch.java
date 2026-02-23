package BackTracking;

import java.util.ArrayList;
import java.util.List;

public class Binary_watch {

    static List<String> result = new ArrayList<>();
    static int[] leds = {8, 4, 2, 1, 32, 16, 8, 4, 2, 1};

    public static List<String> readBinaryWatch(int turnedOn) {
        result.clear();
        backtrack(0, 0, 0, 0, turnedOn);
        return result;
    }
    private static void backtrack(int idx, int count, int hour, int minute, int turnedOn) {
        if(hour > 11 || minute > 59) return;
        if(count == turnedOn){
            String time = hour + ":" + (minute < 10 ? "0" + minute : minute);
            result.add(time);
            return;
        }
        if(idx == 10) return;

        //take this led
        if(idx < 4){
            //hour led
            backtrack(idx+1, count+1, hour+leds[idx], minute, turnedOn);
        }
        else{
            //minute led
            backtrack(idx+1, count+1, hour, minute+leds[idx], turnedOn);
        }

        //skip this led
        backtrack(idx+1, count, hour, minute, turnedOn);
    }
    public static void main(String[] args) {
        int turnedOn = 1;
        List<String> ans = readBinaryWatch(turnedOn);
        System.out.println(ans);
    }
}
