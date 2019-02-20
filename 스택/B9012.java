import java.util.Scanner;
import java.util.Stack;

/**
 * B9012
 */
public class B9012 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int n = 0; n < tc; n += 1) {
            String str = sc.next();
            String[] arrStr = str.split("");
            int strLen = arrStr.length;
            if(strLen % 2 != 0) {
                System.out.println("NO");
                continue;
            }
            Stack<Integer> s = new Stack<Integer>();
            for (int i = 0; i < strLen; i += 1) {
                if (arrStr[i].equals("(")) {
                    s.push(1);
                } else {
                    try {
                        s.pop();
                    } catch (Exception e) {
                        // TODO: handle exception
                        System.out.println("NO");
                        break;
                    }
                }
            }
            if(s.size() == 0) System.out.println("YES");
            else System.out.println("NO");
        }
        sc.close();
    }
}