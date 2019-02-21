import java.util.Scanner;

/**
 * B2292
 */
public class B2292 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numRoom = sc.nextInt();
        sc.close();
        int cnt = 1;
        int val = 6;
        while(numRoom > 1) {
            numRoom -= val;
            cnt += 1;
            val += 6;
        }
        System.out.println(cnt);
    }
}