package Hashmap;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("kunal",89);
        map.put("rahul",98);
        map.put("karan",96);

        System.out.println(map.get("kunal"));
        System.out.println(map.get("rahul"));
        System.out.println(map.get("karan"));
    }
}