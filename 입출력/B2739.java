import java.util.Scanner;

/**
 * B2739
 * 구구단
 */
public class B2739 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        for(int i=1; i <= 9; i+=1) {
            System.out.println(n + " * " + i + " = " + (n*i));
        }
    }
}