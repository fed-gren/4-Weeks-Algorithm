
/**
 * B2442
 * 별찍기 - 5
 */
import java.util.Scanner;

public class B2442 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        for (int i = 1; i <= n; i += 1) {
            for (int j = 0; j < n - i; j += 1) {
                System.out.print(" ");
            }

            for (int j = 0; j < (2 * i) - 1; j += 1) {
                System.out.print("*");
            }

            if (i < n)
                System.out.println();
        }
    }
}