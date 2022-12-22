package jonghwi.pgm.Algorithm;

import java.util.Arrays;
import java.util.PriorityQueue;

public class P131130 {
    static class Solution {
        private int[] parent;
        public int solution(int[] cards) {
            int answer = 0;
            PriorityQueue<Integer> que = new PriorityQueue<>((o1, o2) -> o2-o1);
            parent = new int[cards.length];
            for(int i =0;i<parent.length;i++) parent[i] = i;
            for(int i =0;i<cards.length;i++){
                if(parent[i] != i) continue;
                int count = cycle(cards,i,cards[i]-1);


                if(count == cards.length)
                    return 0;
                que.offer(count);
            }
            return que.poll() * que.poll();
        }
        private int cycle(int[] cards,int p ,int idx){
            if(parent[idx] == p) return 1;
            parent[idx] = p;
            return cycle(cards,p,cards[idx]-1)+1;

        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int solution = sol.solution(new int[]{8, 6, 3, 7, 2, 5, 1, 4});
        System.out.println("solution = " + solution);
    }
}
