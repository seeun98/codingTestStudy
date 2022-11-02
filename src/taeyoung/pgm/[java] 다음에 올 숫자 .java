class Solution {
    public int solution(int[]common) {
        int answer = 0;
        int dis[]=new int[common.length-1];
        int div[]=new int[common.length-1];
        for(int i=1; i<common.length;i++){         
            if(common[i-1]==0){
            dis[i-1]=common[i]-common[i-1]; // 연속된 수의 차   
             continue;
            }
            dis[i-1]=common[i]-common[i-1]; // 연속된 수의 차  
            div[i-1]=common[i]/common[i-1];  //연속된 수의 나누기            
        }
        
        if(dis[0]==dis[1]){
            answer=common[common.length-1]+dis[0];
        }else if(div[0]==div[1]){            
            answer=common[common.length-1]*div[0];
        }
                
        return answer;
    }
}
