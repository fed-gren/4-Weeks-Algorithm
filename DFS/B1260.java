import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * B1260
 */
public class B1260 {
    static int[][] graph;
    static boolean[] visited;
    static int N;
    static int E;
    static int start;

    public static void dfs(int i) {
        visited[i] = true;
        System.out.print(i + " ");
        for(int j = 1; j <= N; j+=1) {
            if(1 == graph[i][j] && false == visited[j]) {
                dfs(j);
            }
        }
    }

    public static void bfs(int i) {
        Queue<Integer> q = new LinkedList<Integer>();
        q.offer(i);
        visited[i] = true;
        System.out.print(i + " ");

        int temp;
        while(!q.isEmpty()) {
            temp = q.poll();
            for(int j = 0; j < N+1; j+=1) {
                if(1 == graph[temp][j] && false == visited[j]) {
                    q.offer(j);
                    visited[j] = true;
                    System.out.print(j + " ");
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        graph = new int[1001][1001];
        E = sc.nextInt();
        visited = new boolean[10001];
        start = sc.nextInt();

        int a,b;

        for(int i=1; i<=E; i+=1) {
            a = sc.nextInt();
            b = sc.nextInt();

            graph[a][b] = graph[b][a] = 1;
        }

        dfs(start);

        for(int i=1; i<=N; i+=1) {
            visited[i] = false;
        }
        System.out.println();
        bfs(start);
    }
}