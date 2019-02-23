import java.util.Scanner;

/**
 * B2455
 */
public class B2455 {

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int total = 0;
        int plus, minus;
        int max = 0;
        for(int i=0; i<4; i+=1) {
            minus = sc.nextInt();
            plus = sc.nextInt();
            total -= minus;
            total += plus;
            if(max < total) max = total;
        }
        sc.close();
        System.out.println(max);
    }
}