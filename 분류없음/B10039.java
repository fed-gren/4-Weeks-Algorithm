import java.util.Scanner;
/**
 * B10039
 */
public class B10039 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for(int i=0; i<5; i+=1) {
            int score = sc.nextInt();
            sum = (score < 40) ? sum + 40 : sum + score;
        }
        sc.close();
        System.out.println(sum/5);
    }
}