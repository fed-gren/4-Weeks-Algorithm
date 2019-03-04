import java.util.Arrays;
import java.util.Scanner;

/**
 * B2309
 */
public class B2309 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9];
        for(int i = 0; i<9; i+=1) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        Arrays.sort(arr);
        int total = 0;
        for(int i=0; i<9; i+=1) {
            total += arr[i];
        }
        for(int i=0; i<9; i+=1) {
            for(int j = 0; j < 9; j+=1) {
                if(i == j) continue;
                if(total - (arr[i] + arr[j]) == 100) {
                    for(int n=0; n<9; n+=1) {
                        if(n == j || n == i) continue;
                        System.out.println(arr[n]);
                    }
                    return;
                }
            }
        }
    }
}