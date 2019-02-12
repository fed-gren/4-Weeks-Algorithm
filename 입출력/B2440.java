
/**
 * B2440
 * 별 찍기 - 3
 * 쓸데없는 걸로 시간 많이 잡아먹음..
 * 별만 찍고 개행하면 되는데 굳이 공백 찍음.. 이상한 생각에 잘못빠지면 헤어나오기가 어렵다.
 */
import java.util.Scanner;

public class B2440 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        for (int i = 0; i < n; i += 1) {
            for (int j = 0; j < n; j += 1) {
                if(n-j > i) {
                    System.out.print("*");
                }
            }
            if (i < n - 1)
                System.out.println();
        }
    }
}