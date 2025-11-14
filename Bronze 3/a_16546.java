/*
    문제

    당신은 N명의 선수가 참가하는 마라톤 대회를 개최했습니다. 각 선수는 1부터 N까지 고유한 번호를 받았으므로, 구분하기가 매우 쉽습니다.

    당신은 선수가 결승점을 통과할 때마다 각 선수의 번호를 기록합니다. 안타깝게도 N-1명의 선수만이 경기를 마쳤습니다. 어떤 선수가 아직 뛰고 있을까요?

    입력

    첫 줄에 정수 N이 주어집니다 (1 <= N <= 2 ^ 15). 다음 줄에 결승점을 통과한 선수의 번호를 나타내는 1부터 N 범위의 고유한 정수가 N-1개 주어집니다.

    출력

    아직 결승점을 통과하지 못한 선수의 번호를 출력합니다.
 */
import java.io.*;
import java.util.StringTokenizer;
public class a_16546 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    public void run() throws IOException{
        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        boolean[] arr = new boolean[n];
        while (st.hasMoreTokens() == true) arr[Integer.parseInt(st.nextToken()) - 1] = true;
        for (int i = 0; i < n; i++) if (arr[i] != true) System.out.println(i + 1);
        br.close();
    }
    public static void main(String[] args) throws IOException{
        new a_16546().run();
    }
}
