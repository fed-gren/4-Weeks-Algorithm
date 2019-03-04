import java.util.Arrays;
import java.util.Scanner;

/**
 * B1026
 */
public class B1026 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        int[] B = new int[n];
        for(int i=0; i<n; i+=1) {
            A[i] = sc.nextInt();
        }
        for(int i=0; i<n; i+=1) {
            B[i] = sc.nextInt();
        }
        sc.close();
        Arrays.sort(A);
        Arrays.sort(B);
        int total = 0;
        for(int i=0; i<n; i+=1) {
            total += (A[n-1-i] * B[i]);
        }
        System.out.println(total);
    }
}