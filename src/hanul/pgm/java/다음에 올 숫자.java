class Solution {
    public int solution(int[] common) {
        int answer = 0;
        int del1 = common[1] - common[0];
        int del2 = common[2] - common[1];
        
        // 등차수열인지 등비수열인지 판단하기
        if (del1 == del2) {
          // 등차수열 -> 마지막 값 + 공비
            answer = common[common.length-1] + del1;
        } else {
          // 등비수열 -> 마지막 값 * 공차
            answer = common[common.length-1]*(common[1]/common[0]);
        }
		}
        return answer;
    }
}