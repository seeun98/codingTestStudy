package juhyun.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//전체길이에서 해당 문자 길이만큼 빼줌
public class Q2941 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] str = br.readLine().toCharArray();
        int cnt = str.length;

        for(int i = 1; i < str.length; i++){
            if(str[i] == '='){
                if(str[i-1] == 'z'){
                    if(i > 1 && str[i-2] == 'd'){ //dz=
                        cnt -=2;
                    }else{ //z=
                        cnt--;
                    }
                }else if(str[i-1] == 'c' || str[i-1] =='s'){ //c=, s=
                    cnt--;
                }
            }else if(str[i] == '-'){
                if(str[i-1] == 'c' || str[i-1] == 'd'){ //c-, d-
                    cnt--;
                }
            }else if(str[i] == 'j'){
                if(str[i-1] =='l' || str[i-1] == 'n'){ //lj, nj
                    cnt--;
                }
            }
        }
        System.out.println(cnt);
    }
}
