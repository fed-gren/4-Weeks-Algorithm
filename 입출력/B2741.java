
/**
 * B2741
 * N 찍기.
 */
import java.util.Scanner;

public class B2741 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        for (int i = 1; i <= n; i += 1) {
            System.out.println(i);
        }
    }
}