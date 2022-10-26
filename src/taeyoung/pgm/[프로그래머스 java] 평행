import java.util.*;
class Solution {
    public int solution(int[][] dots) {      
        int answer = 0;
        double slope[]=new double[6];// 중복제외
        double disX=0;
        double disY=0;
        int count=0;
       for(int i=0;i<4;i++){
                  
           for(int j=i+1;j<4; j++){
 //i j 같은값이 나오면 안되니깐 i+1          
               disX =dots[j][0]-dots[i][0]; 
               disY =dots[j][1]-dots[i][1];              
               slope[count]=disY/disX; //기울기 
               count++;                   
           }          
           
       }    
    
      for(int k=0;k<6;k++){
        double temp=slope[k];
          System.out.print(temp+"  ");
         for(int q=k+1;q<6;q++){
             if(temp==slope[q]){// 배열에 같은값이 있으면 1리턴 반복문 탈출
                 answer=1;
                break;
             }
         }
      }  
    
        return answer;
    }
}


// import java.util.*;
// class Solution {
//     public int solution(int[][] dots) {      
//         int answer = 0;
//         ArrayList<Double>slope=new ArrayList<>();// list 선언
//         double disX=0;
//         double disY=0;
//         int count=0;
//        for(int i=0;i<4;i++){
                  
//            for(int j=i+1;j<4; j++){
//               //i j 같은값이 나오면 안되니깐 i+1          
//                disX =dots[j][0]-dots[i][0]; 
//                disY =dots[j][1]-dots[i][1]; 
//                double temp1=disY/disX; 
//                slope.add(temp1); 
                               
//            }          
           
//        }    
    
//       for(int k=0;k<slope.size();k++){
//         double temp=slope.get(k);
       
//       for(int p=k+1;p<slope.size();p++){
//            if(temp==slope.get(p)){
//               answer=1;
//                break;
//            }
          
//         }
//       }  
    
//         return answer;
//     }
// }









