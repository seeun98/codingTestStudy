class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        
        String[] availableWord = {"aya", "ye", "woo", "ma"};
        
        for(int i = 0; i < babbling.length; i++){
            for(String word : availableWord){
                babbling[i] = babbling[i].replace(word, " ");
            }
            
            if(babbling[i].replaceAll(" ","").equals("")) {answer ++;}
        }
        
        return answer;
    }
}