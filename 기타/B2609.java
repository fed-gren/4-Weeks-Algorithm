import java.util.Scanner;

/**
 * B2609 최대공약수와 최소공배수
 */
public class B2609 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int GCD, LCM;
        int x = sc.nextInt();
        int y = sc.nextInt();
        sc.close();
        GCD = getGCD(x, y);
        LCM = getLCM(x, y, GCD);
        System.out.printf("%d\n%d\n", GCD, LCM);
    }

    public static int getGCD(int x, int y) {
        // x와 y의 최대공약수를 유클리드 호제법으로 구한다.
        int r = 0;
        while (true) {
            r = x % y;
            if (0 == r)
                return y;
            else {
                x = y;
                y = r;
            }
        }
    }

    public static int getLCM(int x, int y, int GCD) {
        /**
         * x, y의 최소공배수를 구한다. x = aG y = bG 로 표현하면 x,y의 최소공배수는 abG로 표현할 수 있다. a = x/G b =
         * y/G 이므로 abG = (x/G)(y/G)*G
         */
        int a = x / GCD;
        int b = y / GCD;
        return a * b * GCD;
    }
}