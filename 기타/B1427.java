import java.util.Arrays;
import java.util.Scanner;
/**
 * B1427
 */
public class B1427 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();
        String[] arrS = s.split("");
        Arrays.sort(arrS);
        int sLen = arrS.length;
        String res = "";
        for(int i=0; i<sLen; i+=1) {
            res = arrS[i] + res;
        }
        System.out.println(res);
    }
}