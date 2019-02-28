/**
 * B10808
 */
import java.util.Scanner;
public class B10808 {

    public static void main(String[] args) {
        int[] cntAlphabet = new int[26];
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();
        int len = s.length();
        for(int i=0; i<len; i+=1) {
            cntAlphabet[s.charAt(i) - 97] += 1;
        }
        for(int i=0; i<26; i+=1) {
            System.out.print(cntAlphabet[i] + " ");
        }
    }
}