package math1;

import java.util.Scanner;

class Main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        int[] answer = new int[T];


        for(int i = 0; i<T; i++) {
            int k = sc.nextInt(); // 구할 층
            int n = sc.nextInt(); // 구할 호수

            int[] arr1 = new int[n+1]; // 0층의 사람들 정보 저장하기 위한 배열
            for(int t =1; t <= n; t++) { // 0층의 각 호수 사람들 사는 수 저장
                arr1[t] = t;
            }
            int[] arr2 = new int[n+1]; //각 층의 사람들 정보를 저장하기 위한 배열

            for(int x =0; x<k; x++) {
                if(x%2 == 0){
                    for(int j=1; j<=n; j++) {
                        if(j == 1) {
                            arr2[j] = arr1[j];
                        } else {
                            int sum = 0;
                            for(int s = 1; s <= j; s++) {
                                sum += arr1[s];
                            }
                            arr2[j] = sum;
                        }
                    }
                } else {
                    for(int j=1; j<=n; j++) {
                        if(j == 1)    arr1[j] = arr2[j];
                        else {
                            int sum =0;
                            for(int s = 1; s <= j; s++) {
                                sum += arr2[s];
                            }
                            arr1[j] = sum;
                        }
                    }
                }
            }
            if(k % 2 == 0) {
                int sum = 0;
                for(int t = 1; t <= n; t++) {
                    sum += arr2[t];
                }
                answer[i] = sum;
            } else {
                int sum = 0;
                for(int t = 1; t<= n; t++) {
                    sum += arr1[t];
                }
                answer[i] = sum;
            }
        }
        for(int i = 0; i<T; i++) {
            System.out.println(answer[i]);
        }
    }
}