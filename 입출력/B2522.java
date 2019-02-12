
/**
 * B2522
 * 별찍기 12
 */
import java.util.Scanner;

public class B2522 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        for (int i = 1; i <= 2 * n - 1; i += 1) {
            if (i <= n) {
                for (int j = 0; j < n-i; j += 1) {
                    System.out.print(" ");
                }
                for (int j = 0; j < i; j += 1) {
                    System.out.print("*");
                }
                System.out.println();
            } else {
                for(int j = 0; j < i-n; j+=1) {
                    System.out.print(" ");
                }
                for(int j=0; j < 2*n-i; j+=1) {
                    System.out.print("*");
                }
                if(i < 2*n-1) System.out.println();
            }

        }
    }
}