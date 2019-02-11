import java.util.Scanner;

/**
 * B11720
 * 숫자의 합. 공백없이 나열된 수 모두 더하기.
 */
public class B11720 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   //총 숫자 수.
        String str = sc.next(); //sc.nextLine() -> error
        sc.close();
        int sum = 0;
        for(int i = 0; i<n; i+=1) {
            sum += Integer.parseInt(str.substring(i, i+1));
        }
        System.out.println(sum);
    }
}