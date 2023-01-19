package seunghyean.pgm.java.algorithm;

// https://school.programmers.co.kr/learn/courses/30/lessons/87946
// 피로도 문제
// 완전탐색 문제로 재귀함수를 통해 전체의 경우에 대해 탐색 가능하도록 구현
    public class 피로도 {
        static class Solution {
            // 각 던전에 대한 방문 여부를 담은 배열
            static boolean[] visited;
            // 탐색 가능한 던전의 수를 담는 변수
            static int result = -1;
            public int solution(int k, int[][] dungeons) {
                // visited 배열 크기에 맞춰 생성
                visited = new boolean[dungeons.length];
                // 재귀함수 실행
                dfs(dungeons,0,0,k);
                return result;
            }

            // 던전에 대해 탐색하는 함수, 탐색 가능한 던전인 경우 자신을 호출하여, 추가 탐색
            public static void dfs(int[][] dungeons,int depth,int count,int pirodo){
                // 탐험 가능한 던전의 수를 Math.max 를 통해 최대 값으로 설정
                result = Math.max(result,count);
                // 전체 배열에 대해 탐색하는 경우 재귀함수 종료
                if(depth==visited.length){
                    return ;
                }


                for(int i = 0 ; i<visited.length;i++){
                    // 해당 던전을 방문한 경우 함수 호출하지 않음
                    if(visited[i]) continue;
                    // 해당 던전을 방문하지 않고, 사용자의 피로도가 요구 피로도보다 같거나 큰 경우
                    if(dungeons[i][0]<=pirodo){
                        // 방문 여부 true로 변경 후, 파라미터 값을 변경하여 재 탐색하도록 설정
                        visited[i] = true;
                        dfs(dungeons,depth+1,count+1,pirodo-dungeons[i][1]);
                        visited[i] = false;
                    }
                }
            }
        }
    }

