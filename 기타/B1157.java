import java.util.Arrays;
import java.util.Scanner;

/**
 * B1157
 */
public class B1157 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        sc.close();
        str = str.toUpperCase();
        int[] cntAlphabet = new int[26];
        int strLen = str.length();
        boolean flag = false;   //최대값 갯수 겹치는지 확인.
        int max = 0;
        for(int i=0; i<strLen; i+=1) {
            //A -> 65
            cntAlphabet[(int)str.charAt(i)-65] += 1;
        }
        for(int i=1; i<26; i+=1) {
            if(cntAlphabet[max] < cntAlphabet[i]) {
                // System.out.println("max : " + max + ", cntAlphabet[" + i + "] : " + cntAlphabet[i]);
                max = i;
                flag = false;
            } else if(cntAlphabet[max] == cntAlphabet[i]) flag = true;
        }
        // System.out.println(Arrays.toString(cntAlphabet));
        // // System.out.println("max : " + max);
        if(flag == false) System.out.println((char)(max+65));
        else if(flag == true) System.out.println('?');
    }
}