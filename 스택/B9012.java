import java.util.Arrays;
import java.util.Scanner;

/**
 * B9012
 */
public class B9012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        Loop:for(int i=0; i<tc; i+=1) {
            Stack9012 s = new Stack9012();
            String str = sc.next();
            String[] arrStr = str.split("");
            int strLen = arrStr.length;
            s.create(strLen);
            for(int j=0; j<strLen; j+=1) {
                if(arrStr[j].equals("(")) {
                    s.push(1);
                } else {
                    if(!s.pop()) {
                        System.out.println("NO");
                        continue Loop;
                    }
                }
            }
            if(!s.empty()) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }
}

class Stack9012 {
    int sSize;
    int len;
    int[] s;
    void create(int size) {
        sSize = size;
        len = 0;
        s = new int[size];
    }

    void push(int data) {
        if(len >= sSize) {
            return;
        }
        s[len] = data;
        len += 1;
    }

    boolean pop() {
        if(len <= 0) {
            return false;
        }
        s[len-1] = 0;
        len -= 1;
        return true;
    }

    boolean empty() {
        if(len <= 0) {
            return true;
        } else {
            return false;
        }
    }
}