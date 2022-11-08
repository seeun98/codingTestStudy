class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] canList = {"aya", "ye", "woo", "ma"};
        
        for(String str : babbling){
            String tmpStr = str;

            // 옹알이가 가능한 단어는 각각 최대 한번만 등장한다는 제한이 있음
            for(String check : canList){
                // 가능한 옹알이를 탐색하여 _으로 문자열을 대체
                // _가 없다면 남은 단어들을 조합해 옹알이가 가능한 경우가 될 수 있음.
                // ex) wyeoo -> w(ye)oo -> (woo) : X
                tmpStr = tmpStr.replace(check, "_");
            }
            
            tmpStr = tmpStr.replace("_", "");
            
            if (tmpStr.length() == 0){
                answer++;
            }
        }       
        return answer;
    }
}