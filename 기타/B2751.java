import java.util.Arrays;
import java.util.Scanner;

/**
 * B2751
 */
public class B2751 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i+=1) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        Arrays.sort(arr);
        for(int data : arr) {
            System.out.println(data);
        }
    }
}