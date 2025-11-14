/*
문제
날짜가 주어지면, 이 날짜가 2023년 10월 21일보다 35일 이상 앞선 날인지를 판별하는 프로그램을 작성하시오.

입력
첫째 줄에 YYYY-MM-DD 형식으로 날짜가 주어진다.

출력
입력으로 주어진 날짜가 2023년 10월 21일보다 35일 이상 앞선 날이라면 GOOD를, 그렇지 않다면 TOO LATE를 출력한다.

제한
- YYYY = 2023
-  <= MM <= 12
- 1 <= DD <= 28

(2023년 10월 21일로부터 35일 앞선 날은 2023년 9월 16일)
 */
import java.io.*;
import java.util.StringTokenizer;
public class a_30319 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    public void run() throws IOException{
        StringTokenizer st = new StringTokenizer(br.readLine(), "-");
        st.nextToken();
        int m = Integer.parseInt(st.nextToken()), d = Integer.parseInt(st.nextToken()); 
        if ((m == 9 && d <= 16) || m < 9) sb.append("GOOD");
        else sb.append("TOO LATE");
        System.out.println(sb);
        br.close();
    }
    public static void main(String[] args) throws IOException{
        new a_30319().run();
    }
}
