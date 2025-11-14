/*
문제
2개의 정수 A, B가 주어진다.

2022년 11월 A일의 B주일 후가 2022년 11월이면 1을, 아니면 0을 출력하라.

이때, 2022년 11월은 2022년 11월 1일부터 2022년 11월 30일까지 30일을 의미하며, x주일 후의 날짜는 7*x일 후를 의미한다.

입력
입력은 다음과 같은 형태로 주어진다.

A
B
출력
2022년 11월 A일의 B주일 후가 2022년 11월이면 1을, 2022년 11월이 아니면 0을 출력한다.

제한
1 ≦ A ≦ 30.
1 ≦ B ≦ 5.
입력되는 모든 값은 정수이다.
예제 입력 1
2022년 11월 19일의 일주일 후는 2022년 11월 26일이다. 이 날짜는 2022년 11월이므로 1을 출력한다.

예제 입력 2
2022년 11월 3일의 4주일 후는 2022년 2022년 12월 1일이다. 이 날짜는 2022년 11월이 아니므로 0을 출력한다.
 */
import java.io.*;
public class a_27332 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public void run() throws Exception{
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        if (a + (b * 7) <= 30) System.out.println(1);
        else System.out.println(0);
        br.close();
    }
    public static void main(String[] args) throws Exception{
        new a_27332().run();
    }
}
