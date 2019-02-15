import java.util.Scanner;
/**
 * B10818
 * 최소, 최대.
 * n개의 정수 주어지면 최소 최대 출력.
 */
public class B10818 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //방법 1. 입력 쭉 비교하며 min, max 값 저장.
        //메모리 : 284424KB         시간 : 1392ms
        //	
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        for(int i=0; i<n; i+=1) {
            int input = sc.nextInt();
            if(max < input) max = input;
            if(min > input) min = input;
        }
        sc.close();
        System.out.println(min + " " + max);

        // 방법 2. 입력 배열로 받아서 정렬한 후 맨 처음, 맨 끝값 출력.
        // 메모리 : 301012KB    	 시간 : 1924ms
        // int[] data = new int[n];
        // for(int i=0; i<n; i+=1) {
        //     data[i] = sc.nextInt();
        // }
        // sc.close();
        // Arrays.sort(data);
        // System.out.println(data[0] + " " + data[n-1]);
    }
}