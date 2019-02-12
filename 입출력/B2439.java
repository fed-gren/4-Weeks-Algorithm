/**
 * B2439
 * 별 찍기 - 2
 */
import java.util.Scanner;
public class B2439 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        for(int i=1; i<=n; i+=1) {
            for(int j = n-i; j >= 1; j-=1) {
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j+=1) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}