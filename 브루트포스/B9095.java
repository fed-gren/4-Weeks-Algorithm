import java.util.Arrays;
import java.util.Scanner;

/**
 * B9095 1,2,3 더하기.
 */
public class B9095 {
    static int[] nums;
    static int numsLen;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for(int i=0; i<tc; i+=1) {
            int n = sc.nextInt();
            nums = new int[n];
            numsLen = n;
            int cnt = 0;
            while(plus()) {
                // printArr();
                if(getSum() == n) {
                    printArr();
                    cnt += 1;
                } 
            }
            System.out.println(cnt);
        }
    }

    public static void printArr() {
        for (int i = 0; i < numsLen; i += 1) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }

    public static boolean plus() {
        int idx = 0;
        while (true) {
            nums[idx] += 1;
            if (nums[idx] >= 4) {
                nums[idx] = 0;
                idx += 1;
                if(idx >= numsLen) return false;
            } else {
                return true;
            }
        }
    }
    
    public static int getSum() {
        int sum = 0;
        for(int i=0; i<numsLen; i+=1) {
            sum += nums[i];
        }
        return sum;
    }
}