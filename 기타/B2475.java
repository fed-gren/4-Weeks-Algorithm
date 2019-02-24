import java.util.Scanner;
/**
 * B2475
 */
public class B2475 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for(int i=0; i<5; i+=1) {
            sum += Math.pow(sc.nextDouble(), 2);
        }
        sc.close();
        System.out.println(sum%10);
    }
}