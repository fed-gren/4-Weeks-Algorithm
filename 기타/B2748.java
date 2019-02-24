import java.util.Scanner;

/**
 * B2748
 */
public class B2748 {
    static long[] fibo = new long[91];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fibo[0] = 0;
        fibo[1] = 1;
        for(int i=2; i<=n; i+=1) {
            fibo[i] = fibo[i-1] + fibo[i-2];
        }
        System.out.println(fibo[n]);
    }
}