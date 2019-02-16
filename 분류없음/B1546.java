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
    }
}