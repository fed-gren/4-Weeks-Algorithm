import java.util.Scanner;
import java.util.Arrays;
public class B2750 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i+=1) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        Arrays.sort(arr);
        for(int i=0; i<n; i+=1) {
            System.out.println(arr[i]);
        }
    }
}