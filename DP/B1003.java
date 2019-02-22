import java.util.Scanner;
/**
 * B1003
 */
public class B1003 {
    static int[] cntZero; // n번째 피보나치수에서 0이 나온 횟수 저장.
    static int[] cntOne; // n번째 피보나치 수에서 1이 나온 횟수 저장.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int i = 0; i < tc; i += 1) {
            int n = sc.nextInt();
            cntZero = new int[n + 1];
            cntOne = new int[n + 1];
            cntZero[0] = 1;
            if(n > 0) cntZero[1] = 0;

            cntOne[0] = 0;
            if(n > 0) cntOne[1] = 1;
            if(0 == n || 1 == n) {
                System.out.println(cntZero[n] + " " + cntOne[n]);
                continue;
            }
            for (int j = 2; j <= n; j += 1) {
                cntZero[j] = cntZero[j - 1] + cntZero[j - 2];
                cntOne[j] = cntOne[j - 1] + cntOne[j - 2];
            }
            System.out.println(cntZero[n] + " " + cntOne[n]);
        }
        sc.close();
    }
}