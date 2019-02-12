
/**
 * B2441
 * 별찍기 - 4
 */
import java.util.Scanner;

public class B2441 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i += 1) {
            for (int j = 0; j < n; j += 1) {
                if (i > j) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            if (i < n - 1)
                System.out.println();
        }
    }
}