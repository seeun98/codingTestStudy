package implementation;

import java.util.Scanner;

public class boj_1157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[26]; // 영문자의 개수는 26개
        // 빈도수를 나타내기 위한 배열 생성
        // 0은 A, 25는 Z

        String str = sc.next(); // 문자열 입력받기

        for (int i = 0; i < str.length(); i++) {
            // 입력 받은 문자열의 길이만큼 반복해서 글자 하나하나 따져봅니다.

            if ('A' <= str.charAt(i) && str.charAt(i) <= 'Z') { // 대문자
                arr[str.charAt(i) - 'A']++; //입력받은 문자열의 문자가 몇 개인지 세어줌
                // H-A를 하면 7이 나오는데 그럼 arr[7]에 해당하는 값을 1씩 올려주는 거임
                // 2개면 2가 나오게끔

            } else {
                arr[str.charAt(i) - 'a']++;
            }
        }

        int max = Integer.MIN_VALUE; // 최댓값을 지정할 변수 선언
        int idx = 0; // 몇 번째 알파벳인지 찾기 위해 선언
        int cnt = 0;

        for (int i = 0; i < 26; i++) {
            if (max < arr[i]) { // 최댓값보다 배열의 값이 크다면 (무조건 큼)
                max = arr[i];
                idx = i;
            }
        }

        for (int i = 0; i < 26; i++){
            if(max==arr[i]){
                cnt++;
            }
        } // 포문 첫째줄 내용은 같지만 쓰는 이유가 달라서 각각 만들어주어야함

        if (cnt>=2){
            System.out.println('?');
        }else{
            System.out.println(Character.toString(idx+'A'));
        }
    }
}


