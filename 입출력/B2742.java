import java.util.Scanner;

/**
 * B2742 기찍 N ㅋㅋㅋ
 */
public class B2742 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        for (int i = n; i >= 1; i -= 1) {
            System.out.println(i);
        }
    }
}