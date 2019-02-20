import java.util.Scanner;

/**
 * B2908
 */
public class B2908 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a, b;
        a = sc.next();
        b = sc.next();
        sc.close();
        String[] arrA, arrB;
        arrA = a.split("");
        arrB = b.split("");
        a = "";
        b = "";
        for(int i=2; i>=0; i-=1) {
            a += arrA[i];
            b += arrB[i];
        }
        int newA = Integer.parseInt(a);
        int newB = Integer.parseInt(b);
        System.out.println((newA > newB) ? newA : newB);
    }
}