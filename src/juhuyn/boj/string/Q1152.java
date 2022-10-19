package juhyun.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1152 {
    
    //trim() -> 앞뒤 공백제거
    //stringTokenizer의 token 개수 카운트

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine().trim());
        System.out.println(st.countTokens());
    }
}
