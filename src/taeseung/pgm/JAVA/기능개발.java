package src.taeseung.pgm.JAVA;

import java.util.Arrays;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/42586
 */
public class 기능개발 {
    static class Solution {
        public int[] solution(int[] progresses, int[] speeds) {
            int[] answer = {};

            int [] arr = new int[100];
            int day = Integer.MIN_VALUE;




            return answer;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] solution = sol.solution(new int[]{93, 30, 55}, new int[]{1, 30, 5});
        System.out.println("solution = " + Arrays.toString(solution));
//      [2,1]

//        int[] solution1 = sol.solution(new int[]{95, 90, 99, 99, 80, 99}, new int[]{1, 1, 1, 1, 1, 1});
//        System.out.println("solution1 = " + Arrays.toString(solution1));
//       [1,3,2]
    }
}