import java.util.Scanner;

/**
 * B11022 A + B - 8
 */
public class B11022 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int i = 1; i <= tc; i += 1) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("Case #" + i + ": " + a + " + " + b + " = " + (a + b));
        }
        sc.close();
    }
}