import java.util.Scanner;

/**
 * B1476
 */
public class B1476 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = 0;
        int[] ESM = {0,0,0};  //E,S,M
        int E = sc.nextInt();
        int S = sc.nextInt();
        int M = sc.nextInt();

        while(!(ESM[0] == E && ESM[1] == S && ESM[2] == M)) {
            ESM[0] += 1;
            if(ESM[0] > 15) ESM[0] = 1;
            ESM[1] += 1;
            if(ESM[1] > 28) ESM[1] = 1;
            ESM[2] += 1;
            if(ESM[2] > 19) ESM[2] = 1;
            year += 1;
        }
        System.out.println(year);
    }
}