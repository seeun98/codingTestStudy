package jonghwi.pgm.Algorithm;

import java.util.*;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/42586
 */
public class P42586 {
    static class Solution {
        public int[] solution(int[] progresses, int[] speeds) {
            List<Integer> ans = new ArrayList<>();
            int idx = 0;
            while(idx < progresses.length){
                int count = 0;
                int day = (int) Math.ceil((100.0- progresses[idx])/speeds[idx]);

                while(idx<progresses.length && progresses[idx] + day*speeds[idx] >= 100 ){
                    count++;
                    idx++;
                }
                ans.add(count);
            }
            return ans.stream().mapToInt(Integer::intValue).toArray();
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] solution = sol.solution(new int[]{93, 30, 55}, new int[]{1, 30, 5});
        System.out.println("solution = " + Arrays.toString(solution));
//      [2,1]

        int[] solution1 = sol.solution(new int[]{95, 90, 99, 99, 80, 99}, new int[]{1, 1, 1, 1, 1, 1});
        System.out.println("solution1 = " + Arrays.toString(solution1));
//       [1,3,2]
    }
}
