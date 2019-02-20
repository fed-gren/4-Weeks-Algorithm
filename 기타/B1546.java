import java.util.Scanner;
/**
 * B1546
 */
public class B1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numSubject = sc.nextInt();
        sc.close();
        double[] arrScore = new double[numSubject];
        double max = 0;    //적어도 0보다 큰 정수 있으므로 0으로 초기화.
        for(int i=0; i<numSubject; i+=1) {
            arrScore[i] = sc.nextInt();
            if(max < arrScore[i]) max = arrScore[i];
        }
        double sum = 0;
        for(int i=0; i<numSubject; i+=1) {
            arrScore[i] = arrScore[i]/max * 100.0;
            sum += arrScore[i];
        }
        System.out.println(sum/(double)numSubject);
    }
}