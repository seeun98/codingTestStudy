package jonghwi.pgm.Algorithm;

import java.util.Arrays;

public class P86491 {
    /**
     * 최소직사각형
     * https://school.programmers.co.kr/learn/courses/30/lessons/86491
     */
    static class Solution {
        public int solution(int[][] sizes) {
            int answer = 0;
            for (int[] size : sizes) {
                Arrays.sort(size);
            }
            int o1 = 0;
            int o2 = 0;
            for (int[] size : sizes) {
                o1 = Math.max(o1,size[0]);
                o2 = Math.max(o2,size[1]);
            }
            return o1*o2;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
//        new int[][]{ new int[]{60, 50}, new int[]{30, 70}, new int[]{60, 30}, new int[]{80, 40} }
        int solution = sol.solution(
                new int[][]{
                        new int[]{60, 50},
                        new int[]{30, 70},
                        new int[]{60, 30},
                        new int[]{80, 40}});
        System.out.println("solution = " + solution);
    }
}
