import java.util.Scanner;

/**
 * B1934
 */
public class B1934 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for(int i=0; i<tc; i+=1) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int x = a;
            int y = b;
            int GCD = 0;
            int r = 0;
            while(true) {
                r = x % y;
                if(0 == r) {GCD=y; break;}
                else {x = y; y = r;}
            }
            int LCM = (a/GCD)*(b/GCD)*GCD;
            System.out.println(LCM);
        }
        sc.close();
    }
}