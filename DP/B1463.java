
/**
 * B1463
 * DP 문제 -> 1로 만들기.
 */
import java.util.Scanner;

public class B1463 {
    static int cnt = 0;
    static int[] memo;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        memo = new int[x + 1];
        sc.close();

        memo[1] = 0; // 1에서 1은 갈 필요 없음.
        // bottom - up 방식.
        for (int i = 2; i <= x; i += 1) {
            memo[i] = memo[i-1] + 1;    // 1을 뺀다. -> 최대값은 계속 1만 빼는 작업 하게 됨.
            if(0 == i % 2) memo[i] = Math.min(memo[i], memo[i/2] + 1);    //현재의 최대값과 나누기 2연산을 통해서 계산한 횟수 비교해서 최소값 적용.
            if(0 == i % 3) memo[i] = Math.min(memo[i], memo[i/3] + 1);
        }
        System.out.println(memo[x]);
    }
}