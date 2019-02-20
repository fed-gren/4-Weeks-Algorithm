import java.util.Scanner;
public class B10809 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        sc.close();
        int[] idxAlpha = new int[26];
        char ch;  //97
        int strLen = str.length();
        for(int i=0; i<26; i+=1) {
            idxAlpha[i] = -1;
        }
        for(int i=0; i<strLen; i+=1) {
            ch = str.charAt(i);
            if(idxAlpha[((int)ch-97)] == -1) idxAlpha[((int)ch-97)] = i;
        }
        for(int i=0; i<26; i+=1) {
            System.out.print(idxAlpha[i] + " ");
        }
        System.out.println();
    }
}