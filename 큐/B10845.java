import java.util.Arrays;
import java.util.Scanner;

/**
 * B10845 push X: 정수 X를 큐에 넣는 연산이다. pop: 큐에서 가장 앞에 있는 정수를 빼고, 그 수를 출력한다. 만약 큐에
 * 들어있는 정수가 없는 경우에는 -1을 출력한다. size: 큐에 들어있는 정수의 개수를 출력한다. empty: 큐가 비어있으면 1, 아니면
 * 0을 출력한다. front: 큐의 가장 앞에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다. back:
 * 큐의 가장 뒤에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
 */
public class B10845 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        MyQ q = new MyQ();
        q.create(n);
        for (int i = 0; i < n; i += 1) {
            String s = sc.next();
            if (s.equals("push")) {
                int val = sc.nextInt();
                q.push(val);
            } else if (s.equals("pop")) {
                q.pop();
            } else if (s.equals("size")) {
                q.size();
            } else if (s.equals("empty")) {
                q.empty();
            } else if (s.equals("front")) {
                q.front();
            } else if (s.equals("back")) {
                q.back();
            }
        }
        sc.close();
    }
}

class MyQ {
    int qSize;
    int cnt; // 큐 안에 아이템 수.
    int[] q;
    int f, r; // front, rear

    void create(int s) {
        qSize = s;
        q = new int[s];
        cnt = 0;
    }

    void push(int n) {
        if (cnt >= qSize) {
        } else {
            q[r] = n;
            r = (r + 1) % qSize;
            cnt += 1;
        }
    }

    void pop() {
        if (cnt <= 0) {
            System.out.println(-1);
        } else {
            System.out.println(q[f]);
            q[f] = 0;
            f = (f + 1) % qSize;
            cnt -= 1;
        }
    }

    void size() {
        System.out.println(cnt);
    }

    void empty() {
        if (cnt <= 0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }

    void front() {
        if (cnt <= 0) {
            System.out.println(-1);
        } else {
            System.out.println(q[f]);
        }
    }

    void back() {
        if (cnt <= 0) {
            System.out.println(-1);
        } else {
            System.out.println(q[r-1]);
        }
    }

}