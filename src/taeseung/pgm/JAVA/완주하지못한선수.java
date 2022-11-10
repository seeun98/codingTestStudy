package src.taeseung.pgm.JAVA;

import java.util.Arrays;

public class 완주하지못한선수 {
    static class Solution {
        public String solution(String[] participant, String[] completion) {


            Arrays.sort(participant);
            Arrays.sort(completion);

            int i = 0;
            for(i = 0; i< completion.length; i++) {
                if (participant[i] != completion[i])
                    break;
            }


                return participant[i];
            }
        }




    public static void main(String[] args) {
        Solution sol = new Solution();
        String ans1 = sol.solution(new String[] {"leo", "kiki", "eden"},
                new String[] {"eden", "kiki"});
        System.out.println(ans1);
		String ans2 = sol.solution(new String[] {"marina", "josipa", "nikola", "vinko", "filipa"},
				new String[] {"josipa", "filipa", "marina", "nikola"});
		System.out.println(ans2);
		String ans3 = sol.solution(new String[] {"mislav", "stanko", "mislav", "ana"},
				new String[] {"stanko", "ana", "mislav"});
		System.out.println(ans3);
    }
}
