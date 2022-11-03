
class Solution {
    public int solution(int[] c) {
        int answer,d,e = 0;

        //int[] c ={1,2,3,4,5~n};
        if( (c[2]-c[1])==(c[1]-c[0]) ){
            d=(c[1]-c[0]);
            answer=(c[c.length-1]+d);
            return answer;
        }

        if( (c[2]-c[1]) != (c[1]-c[0]) ){

            e=(c[2]/c[1]);
            answer=(c[c.length-1] * e);
            return answer;
        }
        return 0;
    }
}


