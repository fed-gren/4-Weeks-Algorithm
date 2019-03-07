/**
 * B1920
 */
import java.util.Arrays;
import java.util.Scanner;
public class B1920 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arrA = new int[n];
        for(int i=0; i<n; i+=1) {
            arrA[i] = sc.nextInt();
        }
        Arrays.sort(arrA);
        int m = sc.nextInt();
        for(int i=0; i<m; i+=1) {
            int num = sc.nextInt();
            // System.out.println(Arrays.binarySearch(arrA, num));
            if(Arrays.binarySearch(arrA, num) >= 0) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
        sc.close();
    }
}