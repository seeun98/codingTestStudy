package jonghwi.pgm.Algorithm;

import java.util.Arrays;

public class P135807 {
    static class Solution {
        public int solution(int[] arrayA, int[] arrayB) {
            int answer = 0;
            answer = Math.max(solve(arrayA,arrayB), solve(arrayB,arrayA));


            return answer;
        }
        private int solve(int[] m, int[] y){
            int res = 0;
            int min = Arrays.stream(m).min().getAsInt();
            outerloop:
            while(min > 0){

                for (int i : m) {
                    if(i % min != 0) {
                        min--;
                        continue outerloop;
                    }
                }
                for (int i : y) {
                    if(i % min == 0) {
                        min--;
                        continue outerloop;
                    }
                }

                res = Math.max(min, res);
                min--;
            }
            return res;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int solution = sol.solution(new int[]{10, 17}, new int[]{5, 20});
        System.out.println("solution = " + solution);

        int solution1 = sol.solution(new int[]{10, 20}, new int[]{5, 17});
        System.out.println("solution1 = " + solution1);

        int solution2 = sol.solution(new int[]{14, 35, 119}, new int[]{18, 30, 102});
        System.out.println("solution2 = " + solution2);
    }
}
