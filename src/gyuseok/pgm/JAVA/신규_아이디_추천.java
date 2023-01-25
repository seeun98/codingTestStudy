package gyuseok.pgm.JAVA;

public class 신규_아이디_추천 {
    class Solution {
        public String solution(String new_id) {
            new_id = new_id.toLowerCase();

            new_id = new_id.replaceAll("[^a-z0-9._-]", "");

            while (true) {
                new_id = new_id.replace("..", ".");
                if (new_id == new_id.replace("..", ".")) {
                    break;
                }
            }

            if (!new_id.isEmpty()&&new_id.charAt(0) == '.') {
                new_id = new_id.substring(1);
            }
            if (!new_id.isEmpty()&&new_id.charAt(new_id.length() - 1) == '.') {
                new_id = new_id.substring(0, new_id.length() - 1);
            }
            if (new_id.isEmpty()) {
                new_id = "a";
            }

            if (new_id.length() >= 16) {
                new_id = new_id.substring(0, 15);
                if (new_id.charAt(new_id.length() - 1) == '.') {
                    new_id = new_id.substring(0, new_id.length() - 1);
                }
            }

            if (new_id.length() <= 2) {
                while(new_id.length()<=2) {
                    new_id+=new_id.charAt(new_id.length()-1);
                }
            }

            String answer = new_id;
            return answer;
        }
    }
}
