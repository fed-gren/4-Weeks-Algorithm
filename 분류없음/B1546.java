<<<<<<< HEAD
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
=======
/**
 * B1546
 */
import java.util.Scanner;
public class B1546 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] score = new int[n];
        int max = 0;
        double avg = 0;
        for(int i =0; i<n; i+=1) {
            score[i] = sc.nextInt();
            if(max < score[i]) max = score[i];
        }
        double[] newScore = new double[n];
        double sum = 0;
        for(int i=0; i<n; i+=1) {
            newScore[i] = (double)score[i] / (double)max * 100;
            sum += newScore[i];
        }
        avg = sum / (double)n;
        System.out.println(avg);
>>>>>>> 4a9eb4084541c01c556de59050b9eee41ab3148f
    }
}