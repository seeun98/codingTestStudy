import java.util.Arrays;
import java.util.Scanner;

public class Main{
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        
        String answer = "";
        String str = sc.next();
        str = str.toLowerCase();
        
        // 배열 2개 생성
        int[] arr1 = new int[1000001];
        int[] arr2 = new int[1000001];
        
        for(int i = 0; i<str.length(); i++) {
            int idx = str.indexOf(str.charAt(i));
            arr1[idx]++;
            arr2[idx]++;
        }
        Arrays.sort(arr2);
        
        if(arr2[1000000] == arr2[999999]){
            answer = "?";
        } else {
            for(int i = 0; i<1000001; i++) {
                if(arr2[1000000] == arr1[i]){
                    answer = String.valueOf(str.charAt(i));
                    answer = answer.toUpperCase();
                    break;
                }
            }
        }
        System.out.println(answer);
        System.out.println("확인용");
    }
}