package jonghwi.pgm.Algorithm;

public class P140107 {
    static class Solution {
        public long solution(int k, int d) {
            long answer = 0;
            for(int x=0;x<=d;x+=k){
                int y = (int) Math.sqrt((long)d*d - (long)x*x);
                answer += y/k+1;
            }
            return answer;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        long ans1 = sol.solution(2,4);
        long ans2 = sol.solution(1,5);
        System.out.println("ans2 = " + ans2);
        System.out.println("ans2 = " + ans1);
    }
}
