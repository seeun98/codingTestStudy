import java.util.HashMap;
import java.util.Map;

public class PgmWeek04 {
	static class Solution {
	    public String solution(String[] participant, String[] completion) {
	    	
	    	HashMap<String, Integer> participants = new HashMap<>();
	        for (String person : participant) {
	        	int flag;
	        	if(participants.containsKey(person)) {
	        		flag = participants.get(person);
	        		participants.put(person, ++flag);
	        	} else {
	        		flag = 1;
	        		participants.put(person, flag);
	        	}
	        }
	        
	        for (String complete : completion) {
	        	if(participants.containsKey(complete)) {
	        		if(participants.get(complete)==1) {
	        			participants.remove(complete);
	        		} else {
	        			participants.replace(complete, participants.get(complete)-1);
	        		}
	        	}
	        }  
       
	        Map.Entry<String, Integer> firstEntry = participants.entrySet().iterator().next();
	        String answer = firstEntry.getKey();
	        return answer;
	    }
	}
	
	public static void main(String[] args) {
		Solution sol = new Solution();
//		String ans1 = sol.solution(new String[] {"leo", "kiki", "eden"},
//				new String[] {"eden", "kiki"});
//		System.out.println(ans1);
//		String ans2 = sol.solution(new String[] {"marina", "josipa", "nikola", "vinko", "filipa"}, 
//				new String[] {"josipa", "filipa", "marina", "nikola"});
//		System.out.println(ans2);
		String ans3 = sol.solution(new String[] {"mislav", "stanko", "mislav", "ana"}, 
				new String[] {"stanko", "ana", "mislav"});
		System.out.println(ans3);
	}

}