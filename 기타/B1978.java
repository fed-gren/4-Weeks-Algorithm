import java.util.Scanner;

/**
 * B1978
 * 주어진 수 중 소수 몇개인지 체크
 */
public class B1978 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int numOfPrimeNum = 0;
        for(int i=0; i<n; i+=1) {
            int num = sc.nextInt();
            int j = num-1;
            for(; j>=2; j-=1) {
                if(num % j == 0) break;
            }
            if(j == 1) numOfPrimeNum += 1;
        }
        System.out.println(numOfPrimeNum);
    }
}