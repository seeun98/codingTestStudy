package gyuseok.pgm.JAVA;

public class 옹알이1 {
    class Solution {
        public int solution(String[] babbling) {
            int answer = 0;
            for(String a:babbling){
                char[] b=a.toCharArray();
                for(int i= 0;i<=b.length-1;i++){
                    if(b.length-1>=(i+2)&&b[i]=='a'&&b[i+1]=='y'&&b[i+2]=='a'){
                        i+=2;
                        if(i==b.length-1)
                            answer+=1;

                    }
                    else if(b.length-1>=(i+2)&&b[i]=='w'&&b[i+1]=='o'&&b[i+2]=='o'){
                        i+=2;
                        if(i==b.length-1)
                            answer+=1;

                    }
                    else if(b.length-1>=(i+1)&&b[i]=='y'&&b[i+1]=='e'){
                        i+=1;
                        if(i==b.length-1)
                            answer+=1;

                    }
                    else if(b.length-1>=(i+1)&&b[i]=='m'&&b[i+1]=='a'){
                        i+=1;
                        if(i==b.length-1)
                            answer+=1;

                    }
                    else
                        break;
                }
            }
            return answer;
        }
    }
}
