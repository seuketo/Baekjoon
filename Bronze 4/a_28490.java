/*
문제
스튜어트는 1부터 n까지의 숫자가 새겨진 직사각형의 프레임을 가지고 있습니다.
프레임 i는 높이 h[i] 와 너비 w[i] 값을 가진 직사각형입니다.
프레임의 크기는 프레임이 덮는 영역입니다. 스튜어트는 자신이 가지고 있는 가장 큰 프레임으로 덮힌 영역을 찾는 데 도움을 주기를 원합니다.

입력
첫 번째 입력 행에는 정확히 1개의 정수, n이 포함됩니다.
입력의 다음 n행은 각각 두 개의 공간으로 구분된 정수를 포함합니다. 입력의 i번째 행은 프레임 i의 높이와 너비를 나타내는 h[i]와 w[i]를 각각 포함합니다.

출력
출력에는 Stuart가 가지고 있는 가장 큰 크기의 프레임으로 덮인 영역인 정수가 하나 포함되어야 합니다.
*/
import java.io.*;
import java.util.StringTokenizer;
public class a_28490 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public void run() throws Exception{
        int n = Integer.parseInt(br.readLine());
        int result = 0;
        for (int i = 0; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int p = Integer.parseInt(st.nextToken()) * Integer.parseInt(st.nextToken());
            if (result == 0 || result <= p || n == 1) result = p;
            else continue;
        }
        System.out.println(result);
        br.close();
    }
    public static void main(String[] args) throws Exception{
        new a_28490().run();
    }
}
