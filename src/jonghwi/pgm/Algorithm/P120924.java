package jonghwi.pgm.Algorithm;

public class P120924 {
    static class Solution {
        public int solution(int[] common) {
            int a = common[0];
            int b= common[1];
            int c = common[2];

            return b + (b-a) == c?common[common.length-1] + (b-a):common[common.length-1] * (b/a);
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int solution = sol.solution(new int[]{1, 2, 3, 4});
        System.out.println("solution = " + solution);
        int solution1 = sol.solution(new int[]{2, 4, 8});
        System.out.println("solution1 = " + solution1);
    }
}
