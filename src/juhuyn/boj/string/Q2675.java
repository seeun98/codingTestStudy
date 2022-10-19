package juhyun.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2675 {

    public static void main(String[] args) throws IOException {
        //입력 n
        //반복횟수 word
        //반복 후에 출력
            //toCharArray() 로 반복
            //sb에 붙이기

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int tc = Integer.parseInt(br.readLine());
        StringTokenizer st;

        for(int k = 0; k < tc; k++){
            st = new StringTokenizer(br.readLine());
            int cycle = Integer.parseInt(st.nextToken());
            char[] word = st.nextToken().toCharArray();

            for(int i = 0; i < word.length; i++){
                for(int j = 0; j < cycle; j++){
                    sb.append(word[i]);
                }
            }
            sb.append('\n');
        }
        System.out.println(sb.toString());
    }
}
