import java.util.Scanner;

/**
 * B10952
 */
public class B10952 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        while (true) {
            a = sc.nextInt();
            b = sc.nextInt();
            if (0 == a && 0 == b) return;
            else System.out.println(a + b);
        }
    }
}