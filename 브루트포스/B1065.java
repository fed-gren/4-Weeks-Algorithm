import java.util.Scanner;
import java.util.Arrays;
/**
 * B1065
 */
public class B1065 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        sc.close();
        int cnt = 0;
        for(int i=1; i<=x; i+=1) {
            if(chkHansoo(i)) {
                cnt += 1;
            }
        }
        System.out.println(cnt);
    }

    public static boolean chkHansoo(int num) {
        //숫자를 문자열로 쪼개 배열에 담은 strArr. 각 숫자간 차이가 동일(등차)한지 판단한 후,
        //모두 등차라면 true, 아니면 false 반환.
        String strNum = Integer.toString(num);
        String[] strArr = strNum.split("");
        int numLen = strArr.length;
        // System.out.println("strArr : " + Arrays.toString(strArr));
        // System.out.println("numLen : " + numLen);
        if(numLen <= 1) return true;
        int tolerance = Integer.parseInt(strArr[1]) - Integer.parseInt(strArr[0]);  //공차
        int sub = 0;
        for(int i = 2; i < numLen; i += 1) {
            sub = Integer.parseInt(strArr[i]) - Integer.parseInt(strArr[i-1]);
            if(tolerance != sub) return false;
        }
        return true;
    }
}