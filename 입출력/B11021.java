/**
 * B11021
 */
import java.util.Scanner;
public class B11021 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();  //test case.
        for(int i=1; i<=tc; i+=1) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("Case #"+i + ": " + (a + b));
        }
    }
}