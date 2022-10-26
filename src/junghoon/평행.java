import java.util.Scanner;
class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
    //미분값-> 기울기 같을 때 평행 -> 1차원 비교 x/y =기울기 같을 때 평행
  if(x1,y1,x2,y2,y3,y4,y5,y6 !=0){
        int x1, y1, x2,y2,x3,y3,x4,y4,x6,y6,x5,y5;
        x1=dots[1][0]-dots[0][0]; //작 엑스
        y1=dots[1][1]-dots[0][1];// 큰 와
        x2=dots[3][0]-dots[2][0];
        y2=dots[3][1]-dots[2][1];

        int m=(y1/x1);
        int M=(y2/x2);
        if(m == M){
            return 1;
        }
        //===
         x3=dots[2][0]-dots[0][0];
        y3=dots[2][1]-dots[0][1];
        x4=dots[3][0]-dots[1][0];
        y4=dots[3][1]-dots[1][1];

        int l=(y3/x3);
        int L=(y4/x4);
        if(L == l){
            return 1;
        }

        ///==
        x5=dots[3][0]-dots[0][0]; //작 엑스
        y5=dots[3][1]-dots[0][1];// 큰 와
        x6=dots[2][0]-dots[1][0];
        y6=dots[2][1]-dots[1][1];
        int q=(y5/x5);
        int w=(y6/x6);
        if(q== w){
            return 1;
        }
  }
        return answer;

    }
}