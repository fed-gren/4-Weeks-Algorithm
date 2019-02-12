import java.util.Scanner;

/**
 * B8393 합. 1~n
 */
public class B8393 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int sum = 0;
        for (int i = 1; i <= n; i += 1) {
            sum += i;
        }
        System.out.println(sum);
    }
}