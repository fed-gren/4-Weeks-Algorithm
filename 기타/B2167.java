/**
 * B2167
 */
import java.util.Scanner;
public class B2167 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] arr = new int[r+1][c+1];
        for(int i=1; i<=r; i+=1) {
            for(int j=1; j<=c; j+=1) {
                arr[i][j] = sc.nextInt();
            }
        }
        int tc = sc.nextInt();
        for(int n=0; n<tc; n+=1) {
            int sum = 0;
            int i = sc.nextInt();
            int j = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            for(int m=i; m<=x; m+=1) {
                for(int l=j; l<=y; l+=1) {
                    sum += arr[m][l];
                }
            }
            System.out.println(sum);
        }
    }
}