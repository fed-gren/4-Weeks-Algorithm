import java.util.Scanner;

/**
 * B8958
 */
public class B8958 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int i = 0; i < tc; i += 1) {
            String str = sc.next();
            String[] strArr = str.split("");
            int strLen = strArr.length;
            int totalScore = 0;
            int currScore = 0;
            for (int j = 0; j < strLen; j += 1) {
                if(strArr[j].equals("O")) {
                    currScore += 1;
                    totalScore += currScore;
                } else {
                    currScore = 0;
                }
            }
            System.out.println(totalScore);
        }
    }
}