package jonghwi.pgm.Algorithm;

public class P120956 {
    static class Solution {
        String[] arr;
        public int solution(String[] babbling) {
            int answer = 0;
            arr = new String[]{"aya","ye","woo","ma"};
            for(String b : babbling){
                if(check(b)) answer++;
            }
            return answer;
        }
        private boolean check(String target){
            int idx = 0;
            while(idx < target.length()){
                boolean flag = false;
                for(int i = 0;i<arr.length;i++){
                    int tmp = 0;
                    if(arr[i].length() > target.length()-idx) continue;
                    while(tmp+idx < target.length() && tmp < arr[i].length() && arr[i].charAt(tmp) == target.charAt(tmp + idx))
                        tmp++;
                    if(tmp == arr[i].length()){
                        flag = true;
                        idx+=tmp;
                        break;
                    }
                }
                if(!flag) return false;
            }
            return true;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int solution = sol.solution(new String[]{"aya", "yee", "u", "maa", "wyeoo"});
        System.out.println("solution = " + solution); // 1
        int solution1 = sol.solution(new String[]{"ayaye", "uuuma", "ye", "yemawoo", "ayaa"});
        System.out.println("solution1 = " + solution1); //3
    }
}
