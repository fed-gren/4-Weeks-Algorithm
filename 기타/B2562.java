import java.util.Scanner;
/**
 * B2562
 */
public class B2562 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max =0, maxIdx = 0;
        for(int i=1; i<=9; i+=1) {
            int input = sc.nextInt();
            if(max < input) {
                max = input;
                maxIdx = i;
            }
        }
        System.out.println(max);
        System.out.println(maxIdx);
    }
}