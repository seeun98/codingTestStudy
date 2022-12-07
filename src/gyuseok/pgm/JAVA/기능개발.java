package gyuseok.pgm.JAVA;

import java.util.LinkedList;
import java.util.Queue;

public class 기능개발 {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> queue = new LinkedList<>();
        int count = 1;
        int[] total = new int[progresses.length];

        for (int i = 0; i < progresses.length; i++) {
            while (progresses[i] < 100) {
                progresses[i] += speeds[i];
                total[i] += 1;
            }
        }
        for (int i = 0; i < total.length; i++) {
            if (i<total.length-1&&total[i] >= total[i+1]) {
                total[i+1]=total[i];
                count+=1;
            }else{
                queue.add(count);
                count = 1;
            }
        }
        int[] answer = new int[queue.size()];
        int a=queue.size();

        for(int i=0;i<a;i++) {
            answer[i]=queue.poll();
        }
        return answer;
    }

}
