import java.util.Arrays;
import java.util.Scanner;

public class Main{
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        
        String answer = "";
        String str = sc.next();
        str = str.toLowerCase(); // 대소문자 구별하지 않기 위해 모두 소문자로 변환 
        
        // 단어의 길이가 최대 1000000 이므로 배열의 크기를 1000001로 설정
        int[] arr1 = new int[1000001];
        int[] arr2 = new int[1000001];
        
        /*
         * 입력받은 문자열(str)을 0번째 인덱스부터 탐색
         * 탐색한 해당 문자를 indexOf() 를 이용하여 str문자열에서 몇변째 인덱스에 위치하는지 찾고 그 인덱스 값을 idx에 저장
         * 그리고 arr1, arr2 배열의 [idx] 값에 +1 함
         * 아래 for문을 모두 돌면 arr1,arr2에는 str에 존재하는 a~z의 알파벳 갯수가 제일 먼저 나오는 알파벳 위치의 인덱스에 저장되어있다
         * 예를 들면 abbacaade 라면 [4,2,0,0,1,0,0,1,1] 이렇게 저장되어있음 
         */
        for(int i = 0; i<str.length(); i++) {
            int idx = str.indexOf(str.charAt(i));
            arr1[idx]++;
            arr2[idx]++;
        }
        Arrays.sort(arr2); // arr2 배열을 오름 차순 순으로 정렬 -> 100000번째 인덱스에는 가장 많이 나온 알파벳이 나온 횟수가 저장되게됨
        
        if(arr2[1000000] == arr2[999999]){ // 1000000번째 인덱스 == 999999인덱스의 값이 동일하다는건 가장많이 나온 알파벳이 2개이상이란것
            answer = "?"; // 그렇다면 answer에 ? 저장
        } else {  		  // 그렇지 않다면 가장 많이 나온 알파벳의 갯수는 오직 한개라는 것
            for(int i = 0; i<1000001; i++) {  // 그렇다면 arr1 배열의 0번째 인덱스부터 차례대로 arr2[1000000]의 값고 동일한 값을 가지는 arr1 인덱스 값을 찾음
                if(arr2[1000000] == arr1[i]){
                    answer = String.valueOf(str.charAt(i));  // 동일한 값을 가지는 인덱스를 찾았다면 charAt을 통해 str문자열의 해당 문자값을 answer에 저장
                    answer = answer.toUpperCase();  // 값은 대문자로 출력해야 하므로 toUpperCase()를 사용
                    break;
                }
            }
        }
        System.out.println(answer);
    }
}