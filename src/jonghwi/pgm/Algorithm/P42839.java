package jonghwi.pgm.Algorithm;

import java.util.HashSet;
import java.util.Set;

public class P42839 {
    /**
     * 소수찾기
     * https://school.programmers.co.kr/learn/courses/30/lessons/42839
     */
    static class Solution {
        Set<Integer> set;
        public int solution(String numbers) {
            set = new HashSet<>();
            solve(numbers, new boolean[numbers.length()],new StringBuilder());

            return set.size();
        }

        private void solve(String numbers, boolean[] visited, StringBuilder sb){
            System.out.println(sb);
            if(sb.length()>=1 &&  isPrime(Integer.parseInt(sb.toString()))){
               set.add(Integer.parseInt(sb.toString()));
            }
            for(int i =0;i<numbers.length();i++){
                if(visited[i]) continue;
                visited[i] = true;
                sb.append(numbers.charAt(i));
                solve(numbers,visited, sb);
                visited[i] =false;
                sb.deleteCharAt(sb.length()-1);
            }
        }

        private boolean isPrime(int target){
            if(target < 2) return false;
            int std = (int) Math.sqrt( target);
            for(int i =2;i<=std;i++){
                if(target % i == 0) return false;
            }
            return true;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        int solution = sol.solution("1234567");
        System.out.println("solution = " + solution);

//        int solution1 = sol.solution("011");
//        System.out.println("solution1 = " + solution1);//2
    }
}
