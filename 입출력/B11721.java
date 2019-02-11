/**
 * B11721
 * 열 개씩 끊어 출력하기.
 */
import java.util.Scanner;
public class B11721 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int strLen = str.length();
        int cnt = 0;
        for(int i=0; i<strLen; i+=1) {
            System.out.print(str.charAt(i));
            cnt++;
            if(cnt % 10 == 0) System.out.println();
        }
        sc.close();
    }
}