package src.taeseung.pgm.JAVA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 평행 {
    static class Solution {
        public int solution(int[][] dots) {
            int answer = 0;

            int slope1 = (dots[0][1] - dots[1][1]) * (dots[2][0] - dots[3][0]);
            int slope2 = (dots[2][1] - dots[3][1]) * (dots[0][0] - dots[1][0]);
            if(slope1 == slope2) return 1;

            int slope3 = (dots[0][1] - dots[2][1]) * (dots[1][0] - dots[3][0]);
            int slope4 = (dots[1][1] - dots[3][1]) * (dots[0][0] - dots[2][0]);
            if(slope3 == slope4) return 1;

            int slope5 = (dots[0][1] - dots[3][1]) * (dots[2][0] - dots[1][0]);
            int slope6 = (dots[2][1] - dots[1][1]) * (dots[0][0] - dots[3][0]);
            if(slope5 == slope6) return 1;

            return answer;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int ans = sol.solution(
                new int[][]{ new int[]{1, 4}, new int[]{9, 2}, new int[]{3, 8}, new int[]{10, 4} }
        );
        System.out.println("ans = " + ans);
    }


}