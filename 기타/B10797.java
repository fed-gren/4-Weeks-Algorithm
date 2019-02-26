import java.util.Scanner;

/**
 * B10797
 */
public class B10797 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        for(int i=0; i<5; i+=1) {
            if(n == sc.nextInt()) cnt += 1;
        }
        System.out.println(cnt);
    }
}