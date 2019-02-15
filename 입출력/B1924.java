/**
 * B1924
 * 2007년
 * 오늘은 2007년 1월 1일 월요일이다. 그렇다면 2007년 x월 y일은 무슨 요일일까? 이를 알아내는 프로그램을 작성하시오.
 * 
 * 입력
 * 첫째 줄에 빈 칸을 사이에 두고 x(1≤x≤12)와 y(1≤y≤31)이 주어진다. 
 * 참고로 2007년에는 1, 3, 5, 7, 8, 10, 12월은 31일까지, 4, 6, 9, 11월은 30일까지, 2월은 28일까지 있다.
 * 
 * 출력
 * 첫째 줄에 x월 y일이 무슨 요일인지에 따라 SUN, MON, TUE, WED, THU, FRI, SAT중 하나를 출력한다.
 */
import java.util.Scanner;
public class B1924 {
    static int[] monthDays = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    static String[] days = {"MON","TUE","WED","THU","FRI","SAT","SUN"};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        sc.close();
        int afterDay = 0;
        for(int i=1; i<x; i+=1) {
            afterDay += monthDays[i];   //지난 달들 날짜수 모두 더하기
        }
        afterDay += (y-1);  //현재 일자 더하기 1.1빼기 위한 -1!

        int order = afterDay % 7;
        System.out.println(days[order]);
    }
}