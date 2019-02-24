/**
 * B4673
 */
public class B4673 {
    static boolean[] isExist = new boolean[20001];
    public static void main(String[] args) {
        int num = 1;
        int newNum = makeNewNumber(num);
        isExist[newNum] = true;
        while(true) {
            num += 1;
            newNum = makeNewNumber(num);
            if(num <= 10000) {
                isExist[newNum] = true;
            } else {
                break;
            }
        }
        for(int i=1; i<=10000; i+=1) {
            if(isExist[i] == false) System.out.println(i);
        }
    }

    public static int makeNewNumber(int n) {
        //새로운 수를 만드는 함수
        String strNum = Integer.toString(n);
        int strLen = strNum.length();
        int newNum = n;
        if(1 >= strLen) {
            newNum *= 2;
        } else {
            String[] arrStrNum = strNum.split("");
            for(int i=0; i<strLen; i+=1) {
                newNum += Integer.parseInt(arrStrNum[i]);
            }
        }
        return newNum;
    }
}