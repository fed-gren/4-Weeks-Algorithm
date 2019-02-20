import java.util.Arrays;
import java.util.Scanner;

/**
 * B1152
 */
public class B1152 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine(); //공백이 포함되어있어서 next(); 쓰면 안됨.
        //맨 앞에 공백있는 경우 하나 더 카운팅 됨.. 제거하자.
        if(str.substring(0,1).equals(" ")) {
            if(1 == str.length()) { //공백 하나만 들어온 경우.
                System.out.println(0);
                return;
            }
            str = str.substring(1); //두번째부터 끝까지 str에 다시 대입.
        }
        String[] strArr;
        strArr = str.split(" ");    //문자열 인자를 기준으로 나눠서 문자열 배열로 반환하는 내장함수.
        System.out.println(Arrays.toString(strArr));
        System.out.println(strArr.length);
    }
}