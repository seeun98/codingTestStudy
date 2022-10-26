class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
		int p11, p12, p21, p22;
		for (int i = 0; i < dots.length - 1; i++) {
			String check = "0123";
			p11 = i;
			check = check.replace(Integer.toString(i), "");

			for (int j = i + 1; j < dots.length; j++) {
				p12 = j;
				String tmpCheck = check.replace(Integer.toString(j), "");

				p21 = tmpCheck.charAt(0) - '0';
				p22 = tmpCheck.charAt(1) - '0';
                
                int p1_ydiff = dots[p11][1] - dots[p12][1];
                int p1_xdiff = dots[p11][0] - dots[p12][0];
                int p2_ydiff = dots[p21][1] - dots[p22][1];
                int p2_xdiff = dots[p21][0] - dots[p22][0];
                
				if (p1_ydiff == 0 && p2_ydiff == 0) {
					// y 축 평행 : atan2의 결과가 항상 0이기에 별도의 처리 필요, 테스트 3
					answer = 1;
					break;
				}

				double l1_deg = Math.toDegrees(Math.atan2(p1_ydiff, p1_xdiff));
				double l2_deg = Math.toDegrees(Math.atan2(p2_ydiff, p2_xdiff));
                
                if (l1_deg < 0) l1_deg += 180;
                if (l2_deg < 0) l2_deg += 180;
                
                if (Math.abs(l1_deg - l2_deg) < 0.0001) {
                    answer = 1;
                    break;
                }
                    
			}
		}
        return answer;
    }
}