import java.util.Arrays;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Arrays.sort(participant);
        Arrays.sort(completion);
        String an = "";
        // ==는 연산자 주소값 비교, .equals 는 값비교

        for (int i = 0; i < participant.length; i++) {
            for (int j = 0;  j< participant.length-1; j++) {
                if (participant[i].equals(completion[j])) {
                    continue;
                } else {
                    an = participant[i];
                }
                answer = an;
            }
        }
        return answer;
    }
}