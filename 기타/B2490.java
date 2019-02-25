import java.util.Arrays;
import java.util.Scanner;

/**
 * B2490
 */
public class B2490 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<3; i+=1) {
            String str = sc.nextLine();
            String[] arrStr = str.split(" ");
            int cntZero = 0;
            for(int j = 0; j < 4; j+=1) {
                if(arrStr[j].equals("0")) cntZero += 1;
            }
            switch(cntZero) {
                case 0:
                System.out.println("E");
                break;
                case 1:
                System.out.println("A");
                break;
                case 2:
                System.out.println("B");
                break;
                case 3:
                System.out.println("C");
                break;
                case 4:
                System.out.println("D");
                break;
            }
        }
        sc.close();
    }
}