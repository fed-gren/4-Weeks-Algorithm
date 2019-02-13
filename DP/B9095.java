import java.util.Scanner;

/**
 * B9095
 */
public class B9095 {
    static int[] DP = new int[11];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int i = 0; i < tc; i += 1) {
            int n = sc.nextInt();
            DP[1] = 1; // 1
            DP[2] = 2; // 2, 1+1
            DP[3] = 4; // 3, 2+1, 1+2, 1+1+1

            for (int j = 4; j <= n; j += 1) {
                DP[j] = DP[j - 3] + DP[j - 2] + DP[j - 1];
            }
            System.out.println(DP[n]);
        }
        sc.close();
    }
}