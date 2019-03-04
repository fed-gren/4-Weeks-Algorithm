import java.util.Scanner;

/**
 * B1193
 */
public class B1193 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        sc.close();
        int cnt = 0;
        for(int i=1; i<10001; i+=1) {
            int a = i;
            if(0 == i % 2) {
                for(int j = 1; j<=i; j+=1) {
                    cnt += 1;
                    if(cnt == x) {
                        System.out.printf("%d/%d\n", j, a);
                    }
                    a -= 1;
                }
            } else {
                a = 1;
                for(int j = i; j>=1; j-=1) {
                    cnt += 1;
                    if(cnt == x) {
                        System.out.printf("%d/%d\n", j, a);
                    }
                    a += 1;
                }
            }
            
        }
    }
}