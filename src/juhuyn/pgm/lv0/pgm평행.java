class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        int d3, d4;

        for(int i = 1; i < dots.length; i++){
            if(9-i == 8){ //i==1 
                d3 = 2; d4 = 3;
            }else if(9-i == 7){ //i == 2
                d3 = 1; d4 = 3;
            }else{ //i == 3
                d3 = 1; d4 = 2;
            }

            double x1 = dots[0][0] - dots[i][0];
            double x2 = dots[d3][0] - dots[d4][0];
            int y1 = dots[0][1] - dots[i][1];
            int y2 = dots[d3][1] - dots[d4][1];

            if((y2/x2) == (y1/x1)){ 
                return 1;
            }
        }
        return answer;
    }
}