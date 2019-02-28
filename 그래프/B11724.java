
/**
 * B11724
 */
import java.util.Scanner;

public class B11724 {
    static int N, E;
    static boolean[] visited;
    static int[][] graph;

    public static void dfs(int i, int cnt) {
        visited[i] = true;
        for (int j = 1; j <= N; j += 1) {
            if (1 == graph[i][j] && false == visited[j]) {
                dfs(j, cnt);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        E = sc.nextInt();
        graph = new int[N + 1][N + 1];
        visited = new boolean[N + 1];

        for (int i = 0; i < E; i += 1) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            graph[x][y] = graph[y][x] = 1;
        }
        sc.close();
        int cnt = 1;
        for (int i = 1; i <= N; i += 1) {
            if (false == visited[i]) {
                dfs(i, cnt);
                cnt += 1;
            }
        }
        System.out.println(cnt - 1);
    }
}