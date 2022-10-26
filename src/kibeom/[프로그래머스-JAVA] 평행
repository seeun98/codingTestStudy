import java.util.*;

class Solution {
    public double solution(int[][] dots) {
        int answer = 0;
        ArrayList<Double> list = new ArrayList<>(); //기울기를 저장하기 위한 리스트
        
        //double 형태로 형변환하여 기울기를 구해서 리스트에 추가
        for(int i = 0; i<4; i++){
            for(int j = i+1; j<4; j++) {
                double tmp = ((double)dots[j][1] - (double)dots[i][1]) / 
                    ((double)dots[j][0] - (double)dots[i][0]);

                list.add(tmp);
            }
        }
        
        // 짝을 맞춰서 기울기 비교
        for(int i = 0; i < list.size()/2; i++){
        {
            double a = list.get(i);
            double b = list.get(list.size()-1-i);
            
            // if(list.get(i).equals(list.get(list.size()-1-i)))    {
            //     answer = 1;
            // }
            if(a==b)    answer = 1;
        }
            
        }
        return answer;
    }
}
