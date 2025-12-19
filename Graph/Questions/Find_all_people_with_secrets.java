package Graph.Questions;

import java.util.*;

public class Find_all_people_with_secrets {

    public static List<Integer> findAllPeople(int n, int[][] meetings, int firstPerson) {
               Map<Integer, List<int[]>> timeMeetings = new TreeMap<>();

        for (int[] meeting : meetings) {
            int person1 = meeting[0];
            int person2 = meeting[1];
            int time = meeting[2];

            timeMeetings.computeIfAbsent(time, k -> new ArrayList<>()).add(new int[]{person1, person2});
        }

        boolean[] knowsSecret = new boolean[n];
        knowsSecret[0] = true;
        knowsSecret[firstPerson] = true;

        for (Map.Entry<Integer, List<int[]>> it : timeMeetings.entrySet()) {

            List<int[]> meets = it.getValue();
            Map<Integer, List<Integer>> adj = new HashMap<>();
            Queue<Integer> que = new LinkedList<>();
            Set<Integer> alreadyAdded = new HashSet<>();

            // Build graph for this time slot
            for (int[] meeting : meets) {
                int person1 = meeting[0];
                int person2 = meeting[1];

                adj.computeIfAbsent(person1, k -> new ArrayList<>()).add(person2);
                adj.computeIfAbsent(person2, k -> new ArrayList<>()).add(person1);

                if (knowsSecret[person1] && !alreadyAdded.contains(person1)) {
                    que.offer(person1);
                    alreadyAdded.add(person1);
                }

                if (knowsSecret[person2] && !alreadyAdded.contains(person2)) {
                    que.offer(person2);
                    alreadyAdded.add(person2);
                }
            }

            // BFS to spread secret within same time
            while (!que.isEmpty()) {
                int person = que.poll();

                for (int nextPerson : adj.getOrDefault(person, Collections.emptyList())) {
                    if (!knowsSecret[nextPerson]) {
                        knowsSecret[nextPerson] = true;
                        que.offer(nextPerson);
                    }
                }
            }
        }

        // Collect result
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (knowsSecret[i]) {
                result.add(i);
            }
        }

        return result;
    }
    public static void main(String[] args) {
        int n = 6;
        int[][] meetings = {{1,2,5},{2,3,8},{1,5,10}};
        int firstPerson = 1;
        List<Integer> ans = findAllPeople(n, meetings, firstPerson);
        System.out.println(ans);
    }
}
