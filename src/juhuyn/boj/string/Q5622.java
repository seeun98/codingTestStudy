package juhyun.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q5622 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        int cnt = 0;
        String[] alphabet = {"", "", "", "ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ"};

        for(int i = 0; i < word.length(); i++){
            String s = String.valueOf(word.charAt(i));

            for(int j = 3; j < 11; j++){
                if(alphabet[j].contains(s)){
                    cnt += j;
                }
            }
        }
        System.out.println(cnt);
    }
}
