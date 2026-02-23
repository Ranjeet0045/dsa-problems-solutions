package Graph.Questions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class Alien_dictionary {

    private static String foreignDictionary(String[] words) {
        Map<Character, List<Character>> graph = buildGraph(words);

        String ans = solve(graph);
        return ans;
    }

    private static String solve(Map<Character, List<Character>> graph) {
        Map<Character, Integer> charToIndex = new HashMap<>();
        Map<Integer, Character> indexToChar = new HashMap<>();

        int idx = 0;
        for (char ch : graph.keySet()) {
            charToIndex.put(ch, idx);
            indexToChar.put(idx, ch);
            idx++;
        }

        // Build adjacency list
        List<List<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < graph.size(); i++) {
            adj.add(new ArrayList<>());
        }

        for (char u : graph.keySet()) {
            int uIndex = charToIndex.get(u);

            for (char v : graph.get(u)) {
                int vIndex = charToIndex.get(v);
                adj.get(uIndex).add(vIndex);
            }
        }

        // Compute indegree
        int[] indegree = new int[adj.size()];

        for (int i = 0; i < adj.size(); i++) {
            for (int j = 0; j < adj.get(i).size(); j++) {
                int v = adj.get(i).get(j);
                indegree[v]++;
            }
        }

        // Queue
        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < adj.size(); i++) {
            if (indegree[i] == 0) {
                q.add(i);
            }
        }

        // Kahn's
        StringBuilder ans = new StringBuilder();

        while (!q.isEmpty()) {

            int u = q.poll();
            ans.append(indexToChar.get(u));

            for (int v : adj.get(u)) {
                indegree[v]--;

                if (indegree[v] == 0) {
                    q.add(v);
                }
            }
        }

        if (ans.length() != adj.size()) {
            return "";
        }

        return ans.toString();
    }


    private static Map<Character, List<Character>> buildGraph(String[] words) {
        Map<Character, List<Character>> graph = new HashMap<>();

        // Add all chars
        for (String word : words) {
            for (char ch : word.toCharArray()) {
                graph.putIfAbsent(ch, new ArrayList<>());
            }
        }

        // Build edges
        for (int i = 0; i < words.length - 1; i++) {

            String w1 = words[i];
            String w2 = words[i + 1];

            if (w1.length() > w2.length() && w1.startsWith(w2)) {
                return new HashMap<>();
            }

            int len = Math.min(w1.length(), w2.length());

            for (int j = 0; j < len; j++) {
                char c1 = w1.charAt(j);
                char c2 = w2.charAt(j);

                if (c1 != c2) {
                    graph.get(c1).add(c2);
                    break;
                }
            }
        }

        return graph;
    }

    public static void main(String[] args) {
        String[] words = {"hrn","hrf","er","enn","rfnn"};
        System.out.println(foreignDictionary(words));
    }
}
