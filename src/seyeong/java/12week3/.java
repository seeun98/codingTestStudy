import java.util.*;

class Solution {
	public int solution(String skill, String[] skill_trees) {
		int answer = 0;

		// 다른 스킬(힐링 등)은 제거
		for (int i = 0; i < skill_trees.length; i++) {

			String[] userSkill = skill_trees[i].split("", -1);

			for (int j = 0; j < userSkill.length; j++) {
				if (!skill.contains(userSkill[j])) {
					userSkill[j] = "";
				}
			}

			// 주요 스킬 트리만 비교
			String resultTree = String.join("", userSkill);
			String[] result = skill.split(resultTree);

			if (resultTree.equals("") || result.length == 0) {
				answer += 1;
			} else if (result.length == 2 && result[0].equals("")) {
				answer += 1;
			}
		}
		return answer;
	}
}