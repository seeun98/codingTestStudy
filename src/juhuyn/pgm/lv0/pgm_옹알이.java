class Solution {
    public int solution(String[] words) {
        int answer = 0;
        
        String[] options = {"aya", "ye", "woo", "ma"};
        for(int i = 0; i < words.length; i++){
            boolean flag = false;
            
            for(int j = 0; j < 4; j++){
                words[i] = words[i].replace(options[j], ".");
            }

            for(int j = 0; j < words[i].length(); j++){
                if(words[i].charAt(j) != '.'){
                    flag = true;
                    break;
                }
            }
            
            if(!flag)
                answer++;
        }
        
        return answer;
    }
}
