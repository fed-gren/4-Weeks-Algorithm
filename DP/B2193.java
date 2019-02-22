import java.util.Scanner;
/**
 * B2193
 * 이친수 찾기.
 */
public class B2193 {
    static long[] DP;    //길이가 n일 때 이친수의 갯수 저장, 피보나치 수열! 90번째는 int로 불가.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        DP = new long[n+1];
        DP[0] = 0;
        DP[1] = 1;
        for(int i=2; i<=n; i+=1) {
            DP[i] = DP[i-1] + DP[i-2];
        }
        System.out.println(DP[n]);
    }
}