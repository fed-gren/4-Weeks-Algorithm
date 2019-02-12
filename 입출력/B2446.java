
/**
 * B2446
 * 별찍기 - 9
 */
import java.util.Scanner;

public class B2446 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        for (int i = 1; i <= 2 * n - 1; i += 1) {
            if (i <= n) {
                for (int j = 0; j < i - 1; j += 1) {
                    System.out.print(" ");
                }
                for (int j = 0; j < 2 * n - 1 - ((i-1) * 2); j += 1) {
                    System.out.print("*");
                }
                System.out.println();
            } else {
                for (int j = 0; j < 2 * n - 1 - i; j += 1) {
                    System.out.print(" ");
                }
                for (int j = 0; j < 2 * (i - n) + 1; j += 1) {
                    System.out.print("*");
                }
                if (i < 2 * n - 1)
                    System.out.println();
            }
        }
    }
}