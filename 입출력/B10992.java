/**
 * B10992
 * 별찍기 17
 */
import java.util.Scanner;
public class B10992 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        for(int i=1; i<= n; i+=1) {
            if(1 == i) {
                for(int j = 1; j<= n-i; j+=1) {
                    System.out.print(" ");
                }
                System.out.print("*");
                System.out.println();
            } else if(n == i) {
                for(int j = 1; j<= 2*n-1; j+=1) {
                    System.out.print("*");
                }
            } else {
                for(int j = 1; j<= n-i; j+=1) {
                    System.out.print(" ");
                }
                System.out.print("*");
                for(int j = 1; j<= 2*(i-1)-1; j+=1) {
                    System.out.print(" ");
                }
                System.out.print("*");
                System.out.println();
            }
        }
    }
}