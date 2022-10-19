package juhyun.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1157 {

    public static void main(String[] args) throws IOException {
        //입력 한 줄
        //toCharArray() + toUppeCase()
        //for문 돌면서 1++
        //최대값 중복인지 찾기

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[26];

        char[] word = br.readLine().toUpperCase().toCharArray();
        for(char c: word){
            arr[c-65]++;
        }

        //최대 중복수 구하기
        int max = 0, idx = -1;
        for(int i = 0; i < 26; i++){
            if(max < arr[i]){
                max = arr[i];
                idx = i;
            }
        }

        boolean flag = false;
        for(int i=0; i<26; i++){
            if(i == idx) //다른 알파벳이면
                continue;

            if(arr[i] == max){
                flag = true;
                break;
            }
        }
        
        /*
        최대숫자이면 max에 넣고
        같은 수이면 same_idx
        arr[same_idx] == arr[max_idx] 이면 같은 횟수라 ? 출력
        for(int i=1; i<27;i++){
            if(cnt[max_idx]<cnt[i]) max_idx = i;
            else if(cnt[max_idx]==cnt[i]) same_idx = i;
        }
        if(cnt[max_idx]==cnt[same_idx]) System.out.print('?');
         */

        System.out.println(flag ? '?' : (char)(idx+65));
    }
}
