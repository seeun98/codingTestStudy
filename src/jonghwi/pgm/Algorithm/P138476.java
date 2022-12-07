package jonghwi.pgm.Algorithm;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class P138476 {
    static class Solution {
        public int solution(int k, int[] tangerine) {
            int answer = 0;
            Map<Integer,Integer> map = new HashMap<>();
            for(int t: tangerine)
                map.put(t, map.getOrDefault(t,0)+1);
            List<Map.Entry<Integer, Integer>> collect = map.entrySet().stream()
                    .sorted((o1, o2) -> o2.getValue() - o1.getValue())
                    .collect(Collectors.toList());
            for (Map.Entry<Integer, Integer> c : collect) {
                if(k <=0) return answer;
                k-= c.getValue();
                answer++;
            }

            return answer;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
//        new int[]{1, 3, 2, 5, 4, 5, 2, 3}
        int solution = sol.solution(6, new int[]{1, 3, 2, 5, 4, 5, 2, 3});
        System.out.println("solution = " + solution);

        int solution1 = sol.solution(4, new int[]{1, 3, 2, 5, 4, 5, 2, 3});
        System.out.println("solution1 = " + solution1);

        int solution2 = sol.solution(2, new int[]{1, 1, 1, 1, 2, 2, 2, 3});
        System.out.println("solution2 = " + solution2);
    }
}
