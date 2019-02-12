
/**
 * B10991
 * 별찍기 16
 */
import java.util.Scanner;

public class B10991 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        for (int i = 1; i <= n; i += 1) {
            for(int j=1; j <= n-i; j+=1) {
                System.out.print(" ");
            }
            System.out.print("*");
            for(int j = 1; j <= i-1; j+=1) {
                System.out.print(" ");
                System.out.print("*");
            }
            if(i < n) System.out.println();
        }
    }
}