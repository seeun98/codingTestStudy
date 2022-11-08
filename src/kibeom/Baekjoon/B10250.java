import java.util.ArrayList;
import java.util.Scanner;

class B10250{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        int cnt = sc.nextInt();

        for(int i = 0; i<cnt; i++) {
            int H = sc.nextInt();
            int W = sc.nextInt();
            int N = sc.nextInt();

            int hosu = 0;
            int floor = 0;
            int answer = 0;

            if(N % H == 0) {
                hosu = N / H;
                floor = H;
            } else {
                hosu = (N / H) + 1;
                floor = N % H;
            }
            answer = (floor * 100) + hosu;
            list.add(answer);

        }

        for(int i =0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}