import java.util.Arrays;
import java.util.Scanner;

/**
 * B11399
 */
public class B11399 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i+=1) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int waitTime = 0;
        int total = 0;
        for(int i=0; i<n; i+=1) {
            waitTime += arr[i];
            total += waitTime;
        }
        System.out.println(total);
    }
}