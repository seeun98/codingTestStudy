package jonghwi.pgm.Algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P92342 {
    static class Solution {
        int[] answer;
        int max;
        List<int[]> list;
        public int[] solution(int n, int[] info) {
             answer = new int[info.length];
             max =  -11;
             solve(info,new int[info.length],n,0);

            System.out.println(Arrays.toString(answer));
            if(max <= 0){
                return new int[]{-1};
            }

            return choose();
        }
        private int[] choose(){
            int idx = 10;
            while(idx >= 0){
                for (int[] ints : list) {
                    if(ints[idx] != 0) return ints;
                }
                idx--;
            }
            return list.get(0);
        }
        private void solve(int[] info, int[] ans, int n,int idx){
            if(idx == 10){
                ans[10] += n;
                int cal = calScore(info,ans);
                if(max <= cal){
                    if(max != cal) list = new ArrayList<>();

                    list.add(Arrays.copyOf(ans,ans.length));
                    max = cal;
                }
                ans[10] =0;
                return;
            }
            int t = info[idx];
            if(n >= t+1){
                ans[idx] = t+1;
                solve(info, ans, n-(t+1),idx+1);
                ans[idx] = 0;
            }
            solve(info,ans,n,idx+1);
        }
        private int calScore(int[] info, int[] ans){
            int a = 0;
            int l = 0;
            for(int i =0;i<11;i++){
                int s = 10-i;
                int aC = info[i];
                int lC = ans[i];
                if(aC == lC && lC == 0) continue;
                if(aC >= lC) a += s;
                else l += s;
            }
            return l-a;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] solution = sol.solution(9,
                new int[]{0,0,1,2,0,1,1,1,1,1,1});
        System.out.println("solution = " + Arrays.toString(solution));
        //[0,2,2,0,1,0,0,0,0,0,0
    }
}
