package juhyun.pgm.lv0;

class Solution {
    public int solution(int[] common) {

        int len = common.length;
        int gap1 = common[1] - common[0];
        boolean flag = false;

        //등차수열
        for(int i = 1; i < len-1; i++){
            if(gap1 != common[i+1] - common[i]){
                flag = true;
                break;
            }
        }

        if(!flag)
            return common[len-1] + gap1;

        //등비수열
        return common[1] / common[0] * common[len-1];

    }
}