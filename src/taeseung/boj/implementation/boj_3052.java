// 두 자연수 A와 B가 있을 때, A%B는 A를 B로 나눈 나머지 이다. 예를 들어, 7, 14, 27, 38을 3으로 나눈 나머지는 1, 2, 0, 2이다.
// 수 10개를 입력받은 뒤, 이를 42로 나눈 나머지를 구한다. 그 다음 서로 다른 값이 몇 개 있는지 출력하는 프로그램을 작성하시오.
// 첫째 줄부터 열번째 줄 까지 숫자가 한 줄에 하나씩 주어진다. 이 숫자는 1,000보다 작거나 같고, 음이 아닌 정수이다.
// 첫째 줄에, 42로 나누었을 때, 서로 다른 나머지가 몇 개 있는지 출력한다.
import java.util.Scanner; // Scanner 사용을 위해서 java.util.Scanner class를 import

public class boj_3052 {
    public static void main(String[] args) {
        // 반복문을 사용하여 42로 나눈 나머지 값을 배열 변수에 넣기 위한 예외처리

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10]; // 입력값 배열
        int[] arr2 = new int[1000]; // 전체 배열
        int a = 42;
        int count = 0;

        for (int i=0; i<10; i++) {
            int n = sc.nextInt();
            arr[i] = n % a;
        }

        for (int i=0; i<arr.length; i++) {
            arr2[arr[i]]++; // arr값을 arr2에 넣어주어 1씩 증
        }

        for (int i = 0; i<arr2.length; i++) {
            if (arr2[i]!=0) {
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
