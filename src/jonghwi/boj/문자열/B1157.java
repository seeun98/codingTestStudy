package jonghwi.boj.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        int[] arr = new int[26];
        int max = -1;
        int idx = 0;
        for (char c : input.toCharArray()) {
            if(Character.isLowerCase(c)){
                arr[c-'a']++;
                if(max < arr[c-'a']){
                    max = arr[c-'a'];
                    idx = c-'a';
                }
            }else{
                arr[c-'A']++;
                if(max < arr[c-'A']){
                    max = arr[c-'A'];
                    idx = c-'A';
                }
            }
        }
        for(int i =0;i<26;i++){
            if(i == idx) continue;
            if(arr[i] == max){
                System.out.println("?");
                return;
            }
        }
        System.out.println((char)('A'+idx));
    }
}