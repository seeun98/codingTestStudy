package jonghwi.pgm.Algorithm;

import java.util.Arrays;

public class P132266 {
    static class Solution {
        public int[] solution(int n, int[][] roads, int[] sources, int destination) {
            int[] answer = {};
            return answer;
        }

    }

    public static void main(String[] args) {
        Solution sol = new Solution();
//        new int[][]{ new int[]{1, 2}, new int[]{2, 3} }
        int[] solution = sol.solution(3, new int[][]{new int[]{1, 2}, new int[]{2, 3}},
                new int[]{2, 3}, 1);
        System.out.println("solution = " + Arrays.toString(solution));
//        new int[][]{ new int[]{1, 2}, new int[]{1, 4}, new int[]{2, 4}, new int[]{2, 5}, new int[]{4, 5} }
//        int[] solution1 = sol.solution(5, new int[][]{new int[]{1, 2}, new int[]{1, 4}, new int[]{2, 4}, new int[]{2, 5}, new int[]{4, 5}}
//                , new int[]{1, 3, 5}, 5);
//        System.out.println("solution1 = " + Arrays.toString(solution1));

    }

}
