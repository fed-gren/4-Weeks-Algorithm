import java.util.Scanner;

/**
 * B10872
 */
public class B10872 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int result = facto(n);
        System.out.println(result);
    }

    public static int facto(int num) {
        if(num <= 1) {
            return 1;
        } else {
            return num * facto(num-1);
        }
    }
}