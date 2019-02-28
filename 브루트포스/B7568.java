import java.util.Scanner;

/**
 * B7568
 */
public class B7568 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numMan = sc.nextInt();
        int[][] data = new int[numMan][2];
        int[] chart = new int[numMan];
        for(int i=0; i<numMan; i+=1) {
            data[i][0] = sc.nextInt();
            data[i][1] = sc.nextInt();
        }
        for(int i=0; i<numMan; i+=1) {
            for(int j=0; j<numMan; j+=1) {
                if(i == j) continue;
                if(data[i][0] < data[j][0] && data[i][1] < data[j][1]) {
                    chart[i] += 1;
                }
            }
        }
        for(int i=0; i<numMan; i+=1) {
            System.out.print((chart[i] + 1) + " ");
        }
    }
}