import java.util.Scanner;

/**
 * B2443
 */
public class B2443 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        for (int i = 0; i < n; i += 1) {
            for(int j = 0; j < i; j+=1) {
                System.out.print(" ");
            }

            for(int j = 0; j<2*n-i*2-1; j+=1) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}