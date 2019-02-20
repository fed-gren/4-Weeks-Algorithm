import java.util.Scanner;

/**
 * B2920
 */
public class B2920 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[8];
        int flag = 0;   //1이면 ascending, 2면 descending
        for(int i = 0; i<8; i+=1) {
            arr[i] = sc.nextInt();
            if(0 == i) {
                if(1 == arr[i]) {
                    flag = 1;
                    continue;
                } else if(8 == arr[i]) {
                    flag = 2;
                    continue;
                } else {
                    System.out.println("mixed");
                    return;
                }
            }
            switch(flag) {
                case 1:
                    if(arr[i] != arr[i-1] + 1) {
                        System.out.println("mixed");
                        return;
                    }
                break;
                case 2:
                if(arr[i] != arr[i-1] - 1) {
                    System.out.println("mixed");
                    return;
                }
                break;
            }
        }
        if(flag == 1) System.out.println("ascending");
        else if(flag == 2) System.out.println("descending");
    }
}