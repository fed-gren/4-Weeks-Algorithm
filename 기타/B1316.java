import java.util.Scanner;

/**
 * B1316
 */
public class B1316 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        for(int i=0; i<n; i+=1) {
            String str = sc.next();
            if(check(str)) {
                cnt += 1;
            } 
        }
        sc.close();
        System.out.println(cnt);
    }

    public static boolean check(String str) {
        int len = str.length();
        char ch = '0';
        for(int i=0; i<len-2; i+=1) {
            ch = str.charAt(i);
            for(int j = i+2; j <len; j+=1) {
                if(ch == str.charAt(j)) {
                    if(ch == str.charAt(j-1)) continue;
                    else return false;
                }
            }
        }
        return true;
    }
}