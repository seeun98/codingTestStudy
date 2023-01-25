package gyuseok.pgm.JAVA;

public class 피로도 {
    class Solution {

        static int result = -1;

        public void dfs(int k, int[][] dungeon, boolean visited[], int count) {
            result = Math.max(count, result);
            for (int i = 0; i < dungeon.length; i++) {

                if (visited[i] == true)
                    continue;

                if (dungeon[i][0] <= k) {
                    visited[i] = true;
                    dfs(k - dungeon[i][1], dungeon, visited, count + 1);
                    visited[i] = false;
                }

            }


        }

        public int solution(int k, int[][] dungeons) {

            boolean visited[] = new boolean[dungeons.length];
            dfs(k, dungeons, visited, 0);


            return result;
        }
    }
}