/**
 * B5622
 */
import java.util.Scanner;
public class B5622 {

    public static void main(String[] args) {
                //   A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z
        int[] arr = {2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 6, 7, 7, 7, 7, 8, 8, 8, 9, 9, 9, 9};
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        sc.close();
        int strLen = str.length();
        int sum = 0;
        for(int i=0; i<strLen; i+=1) {
            char ch = str.charAt(i);
            sum += (arr[(int)ch - 65] + 1);
        }
        System.out.println(sum);
    }
}