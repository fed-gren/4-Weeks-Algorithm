import java.util.Scanner;
/**
 * B1929
 */
public class B1929 {
    static boolean[] prime;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int e = sc.nextInt();
        sc.close();
        prime = new boolean[e+1];
        prime[0] = prime[1] = false;
        for(int i=2; i<=e; i+=1) {
            prime[i] = true;
        }

        for(int i=2; i*i<=e; i+=1) {
            for(int j = i*i; j <= e; j+=i) {
                prime[j] = false;
            }
        }
        for(int i=0; i<=e; i+=1) {
            if(true == prime[i] && i >= s) System.out.println(i);
        }
    }
}