import java.util.Arrays;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";

        Arrays.sort(participant);
        Arrays.sort(completion);

        System.out.println(Arrays.toString(participant));
        System.out.println(Arrays.toString(completion));
        // ==는 연산자 주소값 비교, .equals 는 값비교

        int i=0;
        for (i = 0;  i<completion.length; i++) {
            if (participant[i].equals(completion[i])) {
                continue;
            } else {
                answer= participant[i];
            }

        }
        return answer;

    }
}