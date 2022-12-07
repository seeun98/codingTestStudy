package jonghwi.pgm.Algorithm;

import java.util.Stack;

public class P131704 {
    static class Solution {
        public int solution(int[] order) {
            int answer = 0;

            Stack<Integer> st = new Stack<>();
            int c = 1;
            for (int o : order) {
                if(c == o){
                    c++;
                    answer++;
                }else if(!st.isEmpty() && st.peek() == o){
                    st.pop();
                    answer++;
                }else {
                    if(c > o) break;
                    while(c < o){
                        st.push(c);
                        c++;
                    }
                    c++;
                    answer++;
                }
            }
            return answer;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int solution = sol.solution(new int[]{1,2,4,3,5});
        System.out.println("solution = " + solution);
    }
}
