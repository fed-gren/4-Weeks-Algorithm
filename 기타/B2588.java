import java.util.Scanner;

/**
 * B2588
 */
public class B2588 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String str = sc.next();
        int b = Integer.parseInt(str);
        int res = a * b;
        sc.close();
        for(int i=2; i>=0; i-=1) {
            int tempInt = Integer.parseInt(str.substring(i,i+1));
            System.out.println(a*tempInt);
        }
        System.out.println(res);
    }
}