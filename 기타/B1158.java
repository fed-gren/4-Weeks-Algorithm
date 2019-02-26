import java.util.Scanner;

/**
 * B1158
 */
public class B1158 {
    static int[] circle;
    static int circleLen;
    static int idx = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int countRemove = 0;
        circle = new int[n];
        circleLen = n;
        for (int i = 0; i < n; i += 1) {
            circle[i] = i + 1;
        }
        int counter = sc.nextInt();
        System.out.print("<");
        while (!chkAllZero(circle)) {
            remove(counter);
            countRemove += 1;
            if(countRemove < n) System.out.print(", ");
        }
        System.out.print(">");
    }

    public static boolean chkAllZero(int[] circle) {
        for (int i = 0; i < circleLen; i += 1) {
            if (circle[i] != 0)
                return false;
        }
        return true;
    }

    public static void remove(int counter) {
        int tempCounter = 0;
        while (true) {
            if (circle[idx] != 0) {
                tempCounter += 1;
                if (tempCounter == counter) {
                    System.out.print(circle[idx]);
                    circle[idx] = 0;
                    idx += 1;
                    if (idx >= circleLen)
                        idx = 0;
                    break;
                }
            }
            idx += 1;
            if (idx >= circleLen)
                idx = 0;
        }
    }
}