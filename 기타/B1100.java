import java.util.Scanner;
/**
 * B1100
 */
public class B1100 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        for(int i=0; i<8; i+=1) {
            String board;
            if(i % 2 == 0) {
                board = "WBWBWBWB";
            } else {
                board = "BWBWBWBW";
            }
            String status = sc.nextLine();
            for(int j = 0; j<8; j+=1) {
                if(board.charAt(j) == 'W' && status.charAt(j) == 'F') {
                    cnt += 1;
                }
            }
        }
        sc.close();
        System.out.println(cnt);
    }
}