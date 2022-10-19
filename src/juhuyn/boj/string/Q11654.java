package juhyun.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q11654 {

    //입력 -> 아스키코드 출력
    //char -> int 캐스팅
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println((int)(br.readLine().charAt(0)));
    }
}
