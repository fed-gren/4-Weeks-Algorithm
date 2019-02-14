/**
 * B10844
 */
import java.util.Scanner;
public class B10844 {
    static long[] DP;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        DP = new long[10001];
        DP[1] = 9;
        DP[2] = 17;
        for(int i=3; i <= n; i+=1) {
            DP[i] = (2*DP[i-1] - (i-1)) % 1000000000L;
            System.out.println("DP["+i+"] : " +DP[i]);
        }
    }
}