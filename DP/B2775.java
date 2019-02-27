import java.util.Arrays;
import java.util.Scanner;

/**
 * B2775
 */
public class B2775 {
    static int[][] DP = new int[15][15];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for(int i=0; i<15; i+=1) {
            DP[0][i] = i+1;
        }

        for(int i=1; i<15; i+=1) {  //층
            for(int j=0; j<15; j+=1) {  //호
                for(int k = 0; k <= j; k+=1) {
                    DP[i][j] += DP[i-1][k];
                }
            }
        }
        for(int i=0; i<tc; i+=1) {
            int k = sc.nextInt();
            int n = sc.nextInt();
            System.out.println(DP[k][n-1]);
        }
        sc.close();
    }
}