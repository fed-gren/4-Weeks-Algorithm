import java.util.Scanner;

/**
 * B11762
 */
public class B11726 {
    static int[] DP;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        DP = new int[1001];  //n을 1일 때 DP[2]에 넣어주므로 n+1이 아닌, 1001로 배열 할당.
        DP[1] = 1;  //2x1일 때, 1개
        DP[2] = 2;  //2x2일 때, 2개
        for(int i=3; i<= n; i+=1) {
            DP[i] = (DP[i-1] + DP[i-2]) % 10007;
        }
        System.out.println(DP[n]);
    }
}