package gyuseok.pgm.JAVA;

import java.util.HashMap;
import java.util.Map;

public class 완주하지못한선수 {
    class Solution {

        public String solution(String[] participant, String[] completion) {

            String answer = "";
            Map<String, Integer> map=new HashMap<>();
            for(String str: participant) {
                if(map.containsKey(str)) {
                    map.put(str, map.get(str)+1);
                }else {
                    map.put(str, 1);
                }
            }
            for(String str: completion) {
                map.put(str, map.get(str)-1);
                if(map.get(str)==0)
                    map.remove(str);
            }
            for(String str:map.keySet())
                answer=str;
            return answer;
        }
    }
}
