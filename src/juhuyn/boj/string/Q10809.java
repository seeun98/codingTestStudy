package juhyun.string;

import java.io.*;

public class Q10809 {

    public static void main(String[] args) throws IOException {
        //한 줄 입력
        //포함x -> -1, 포함되면 첫 위치

        //-1로 초기화
        //charAt으로 받다가
        //n번째 글자 - 97 해서 i번째 추가
        //if로 -1이 아닌 경우

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        char[] word = br.readLine().toCharArray();
        int[] arr = new int[26];
        for(int i = 0; i < 26; i++){
            arr[i] = -1;
        }

        for(int i = 0; i<word.length; i++){
            int idx = word[i] - 97;
            if(arr[idx] == -1){
                arr[idx] = i;
            }
        }

        for (int i = 0; i < 25; i++) {
            sb.append(arr[i]).append(' ');
        }
        sb.append(arr[25]);

        System.out.println(sb.toString());
    }
}
