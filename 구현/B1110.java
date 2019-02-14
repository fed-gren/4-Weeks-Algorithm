import java.util.Scanner;

/**
 * B1110 더하기 사이클.
 */
public class B1110 {
    static int cntCycle = 1;
    static int firstNum;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        firstNum = sc.nextInt();
        sc.close();
        int outputNum = cycle(firstNum);
        while(firstNum != cycle(outputNum));
        System.out.println(cntCycle);
    }

    public static int cycle(int num) {
        String str = Integer.toString(num);
        if (num < 10) {
            int a = "0";
            int b = str;
        } else {
            int a = Integer.parseInt(str.substring(0, 1));
            int b = Integer.parseInt(str.substring(1, 2));
        }
        int sum = a + b;
        String outputStr = Integer.toString(sum);
        int len = outputStr.length();
        outputStr = Integer.toString(b) + Integer.toString(sum).substring(len - 1);
        cntCycle += 1;
        System.out.println("cycle result : " + outputStr);
        return Integer.parseInt(outputStr);
    }
}