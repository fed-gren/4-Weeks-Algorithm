import java.util.Scanner;

/**
 * B11727
 * 점화식.
 * 1. i-1 까지 채우고, 2x1 채우기
 * 2. i-2 까지 채우고, 1x2 두개 채우기
 * 3. i-2 까지 채우고, 2x2 채우기.
 */
public class B11727 {
    static int[] DP = new int[1001];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        DP[1] = 1;
        DP[2] = 3;
        for(int i=3; i<=n; i+=1) {
            DP[i] = (DP[i-1] + (2*DP[i-2])) % 10007;
        }
        System.out.println(DP[n]);
    }
}