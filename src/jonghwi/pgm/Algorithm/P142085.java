package jonghwi.pgm.Algorithm;

import java.util.Arrays;
import java.util.PriorityQueue;

public class P142085 {
    static class Solution {
        public int solution(int n, int k, int[] enemy) {
            PriorityQueue<Integer> que = new PriorityQueue<>((o1, o2) -> o2-o1);
            int idx = 0;
            int sum = 0;
            while(idx < enemy.length){
                System.out.println(que);
                int target = enemy[idx];

                if(target + sum > n){
                    if( k > 0){
                        k--;
                        que.offer(target);
                        sum+= target;
                        sum -= que.poll();
                    }else{
                        return idx;
                    }
                }else{
                    sum += target;
                    que.offer(target);
                }
                idx++;
            }
            return idx;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int solution = sol.solution(7, 3, new int[]{4, 2, 4, 5, 3, 3, 1});
        System.out.println("solution = " + solution);
    }
}
