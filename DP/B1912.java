
/**
 * B1912
 */
import java.util.Scanner;
public class B1912 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dp = new int[n+1];
        for(int i=1; i <= n; i+=1) {
            dp[i] = sc.nextInt();
        }

        //dp[n] = dp[n-1] + dp[n] -> n까지의 연속된 수의 합.
        //음수만 아니라면 어떤 수도 연속으로 포함하면 된다.

        int max = dp[1];

        for(int i=2; i<=n; i+=1) {
            if(dp[i-1] > 0 && dp[i] + dp[i-1] > 0) {
                dp[i] += dp[i-1];
            }
            if(max < dp[i]) {
                max = dp[i];
            }
        }

        System.out.println(max);
    }
}