package jonghwi.pgm.SQL.Algorithm;

public class P120875 {
    static class Solution {
        public int solution(int[][] dots) {
            // 0,1 번째 점
            int a = (dots[0][1] - dots[1][1]) * (dots[2][0] - dots[3][0]);
            int b = (dots[2][1] - dots[3][1]) * (dots[0][0] - dots[1][0]);
            if(a == b) return 1;

            // 0,2 번째 점
            a = (dots[0][1] - dots[2][1]) * (dots[1][0] - dots[3][0]);
            b = (dots[1][1] - dots[3][1]) * (dots[0][0] - dots[2][0]);
            if(a == b) return 1;

            // 0,3 번째 점
            a = (dots[0][1] - dots[3][1]) * (dots[2][0] - dots[1][0]);
            b = (dots[2][1] - dots[1][1]) * (dots[0][0] - dots[3][0]);
            if(a == b) return 1;

            return 0;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
//        new int[][]{ new int[]{1, 4}, new int[]{9, 2}, new int[]{3, 8}, new int[]{10, 4} }
        int solution = sol.solution(
                new int[][]{new int[]{1, 4}, new int[]{9, 2}, new int[]{3, 8}, new int[]{10, 4}}
        );
        System.out.println("solution = " + solution);
    }
}
