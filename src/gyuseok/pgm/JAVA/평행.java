package gyuseok.pgm.JAVA;

public class 평행 {
    static class Solution {
        public int solution(int[][] dots) {
            int answer = 0;

            boolean a=(dots[0][0]-dots[1][0])*(dots[2][1]-dots[3][1])==(dots[2][0]-dots[3][0])*(dots[0][1]-dots[1][1]);
            boolean b=(dots[0][0]-dots[2][0])*(dots[1][1]-dots[3][1])==(dots[1][0]-dots[3][0])*(dots[0][1]-dots[2][1]);
            boolean c=(dots[0][0]-dots[3][0])*(dots[1][1]-dots[2][1])==(dots[1][0]-dots[2][0])*(dots[0][1]-dots[3][1]);
            if(a||b||c) answer=1;
            else answer=0;


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