package juhyun.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2908 {

    public static void main(String[] args) throws IOException {
        //stringtokenizer로 두 수 입력
        //charAt으로 거꾸로 저장해서
        //더 큰 숫자 출력

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[2];

        for(int i = 0; i < 2; i++){
            String word = st.nextToken();
            StringBuilder sb = new StringBuilder();
            for(int j = 2; j >= 0; j--){
                sb.append(word.charAt(j));
            }
            arr[i] = Integer.parseInt(sb.toString());
        }

        System.out.println(Math.max(arr[0], arr[1]));
    }
}
