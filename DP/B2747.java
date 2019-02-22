import java.util.Scanner;

/**
 * B2747
 */
public class B2747 {
    static int[] DP;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        DP = new int[n+1];
        DP[0] = 0;
        DP[1] = 1;
        for(int i=2; i<=n; i+=1) {
            DP[i] = DP[i-1] + DP[i-2];
        }
        System.out.println(DP[n]);
    }
}