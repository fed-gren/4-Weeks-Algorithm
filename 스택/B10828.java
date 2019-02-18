import java.util.Scanner;

/**
 * 10828
 */
public class B10828 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        MyStack S = new MyStack();
        S.create(n);
        for (int i = 0; i < n; i += 1) {
            String command = sc.next();
            switch (command) {
            case "push":
                int data = sc.nextInt();
                S.push(data);
                break;
            case "pop":
                S.pop();
                break;
            case "size":
                S.size();
                break;
            case "empty":
                S.empty();
                break;
            case "top":
                S.top();
                break;
            default:
                break;
            }
        }
        sc.close();
    }
}

class MyStack {
    int stackSize;
    int len;
    int[] stack;

    void create(int size) {
        stackSize = size;
        stack = new int[size];
        len = 0;
    }

    void push(int data) {
        // overflow 경우 없음.
        stack[len] = data;
        len += 1;
    }

    void pop() {
        if (len <= 0) {
            System.out.println(-1);
            return;
        }
        System.out.println(stack[len - 1]);
        stack[len - 1] = 0;
        len -= 1;
    }

    void size() {
        System.out.println(len);
    }

    void empty() {
        if (len > 0) {
            System.out.println(0);
        } else {
            System.out.println(1);
        }
    }

    void top() {
        if (len <= 0) {
            System.out.println(-1);
        } else {
            System.out.println(stack[len - 1]);
        }
    }
}