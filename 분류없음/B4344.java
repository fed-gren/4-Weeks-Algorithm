import java.util.Scanner;

/**
 * B4344
 */
public class B4344 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for(int i = 0; i<tc; i+=1) {
            int n = sc.nextInt();
            int[] arrScore = new int[n];
            int sum = 0;
            for(int j = 0; j < n; j+=1) {
                arrScore[j] = sc.nextInt();
                sum += arrScore[j];
            }
            double avg = (double)sum / (double)n;
            int cnt = 0;
            for(int j = 0; j < n; j+=1) {
                if(arrScore[j] > avg) cnt += 1;
            }
            System.out.printf("%.3f", (double)cnt/(double)n*100);
            System.out.println("%");
        }
    }
}