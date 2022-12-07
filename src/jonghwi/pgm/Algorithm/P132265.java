package jonghwi.pgm.Algorithm;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class P132265 {
    static class Solution {
        public int solution(int[] topping) {
            int answer = 0;
            if(topping.length == 1) return answer;

            Map<Integer, Integer> left = new HashMap<>();
            Map<Integer, Integer> right = new HashMap<>();
            for (int i : topping)
                right.put(i, right.getOrDefault(i,0)+1);
            int idx = 0;
            while(idx< topping.length){

                right.put(topping[idx], right.get(topping[idx])-1);
                if(right.get(topping[idx]) == 0) right.remove(topping[idx]);

                left.put(topping[idx], left.getOrDefault(topping[idx],0)+1);

                if(right.size() == left.size()) answer++;

                idx++;
            }
            return answer;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int solution = sol.solution(new int[]{1, 2, 1, 3, 1, 4, 1, 2});
        int sol2 = sol.solution(new int[]{1, 2, 3, 1, 4});
        System.out.println("solution = " + solution);
        System.out.println("sol2 = " + sol2);
    }
}
