import java.util.Scanner;

/**
 * B1110
 */
public class B1110 {
    static String inStr;
    static int inStrLen;    
    static int cntCycle;    //사이클 횟수 카운팅 변수.

    public static String addZero(String str) {
        //인자로 들어온 문자열이 1자릿수 이면 앞에 0을 붙여주는 함수.
        int strLen = str.length();
        if(1 == strLen) {
            str = "0" + str;
        }
        return str;
    }

    public static void calcCycle(String str) {
        //앞 자리 더하기 뒷자리 처리해서 입력과 같은 결과면 true, 아니면 false 반납.
        
        int a = Integer.parseInt(str.substring(0,1));   //앞자리수.
        int b = Integer.parseInt(str.substring(1,2));   //뒷자리수.
        String temp = Integer.toString(a+b);    //더한 수 문자열 처리.
        temp = addZero(temp);
        temp = b+temp.substring(1,2);   //입력문자의 뒷자리와 계산한 값의 뒷자리 합침
        cntCycle += 1;
        if(temp.equals(inStr)) { //재귀 기저조건.
            return;
        } else {
            // System.out.println("다시 들어가는 값 : " + temp);
            calcCycle(temp);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        inStr = sc.nextLine();
        sc.close();
        inStrLen = inStr.length();
        inStr = addZero(inStr);      //한 자릿수에는 앞에 0 붙여주기!
        calcCycle(inStr);
        System.out.println(cntCycle);
    }
}