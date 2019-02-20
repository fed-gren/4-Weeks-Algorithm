import java.util.Scanner;
public class B2675 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for(int i=0; i<tc; i+=1) {
            int cntCopy = sc.nextInt();
            String str = sc.next();
            String[] arrStr = str.split("");
            int strLen = arrStr.length;
            for(int n = 0; n<strLen; n+=1) {
                for(int c = 0; c<cntCopy; c+=1) {
                    System.out.print(arrStr[n]);
                }
            }
            System.out.println();
        }
        sc.close();
    }
}