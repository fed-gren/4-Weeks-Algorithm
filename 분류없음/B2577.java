import java.util.Scanner;

/**
 * B2577
 */
public class B2577 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String res = Integer.toString(sc.nextInt() * sc.nextInt() * sc.nextInt());
        sc.close();
        int resLen = res.length();
        int[] cntNums = new int[10];  //0 부터 9까지 갯수 체크할 배열.
        for(int i=0; i<resLen; i+=1) {
            cntNums[Integer.parseInt(res.substring(i,i+1))] += 1;
        }
        for(int i=0; i<10; i+=1) {
            System.out.println(cntNums[i]);
        }
    }
}