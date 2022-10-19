package juhyun.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        int cnt = tc;


        for(int i = 0; i< tc; i++){
            String str = br.readLine();
            int[] arr = new int[26];
            boolean flag = false;
            
            //첫글자
            char prev = str.charAt(0);
            arr[prev-97]++;

            for(int j = 1; j < str.length(); j++){
                char c = str.charAt(j);
                arr[c - 97]++;
                if(prev != c && arr[c-97] > 1){ //이전 단어와 다르고 1보다 크다 == 이전에 나온것
                        flag = true;
                        break;
                }
                prev = c;
            }

            //그룹단어가 아니면 감소
            if(flag)
                cnt--;
        }

        System.out.println(cnt);
    }
}
