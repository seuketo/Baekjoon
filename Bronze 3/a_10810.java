import java.io.*;
import java.util.StringTokenizer;
public class a_10810 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    public void run() throws IOException{
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        for (int i = 1; i <= m; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
            for (int j = a; j <= b; j++) arr[j - 1] = k;
        }
        for (int a : arr) {
            if (a == 0) sb.append(0);
            else sb.append(a);
            sb.append(" ");
        }
        System.out.println(sb);
        br.close();
    }
    public static void main(String[] args) throws IOException{
        new a_10810().run();
    }
}

/* 
 - 도현이는 N개의 바구니를 소유.
    - 각각의 바구니에는 1 ~ N까지의 번호 부여.
 - 도현이는 1 ~ N까지 적힌 공을 매우 많이 가지고 있음.
 - 가장 처음 바구니에는 공 X, 바구니에는 공을 1개만 넣을 수 있음.
 - 공을 M번 넣음. 한번의 횟수에 바구니 번호의 범위를 정하고, 해당 범위 안에 속한 바구니에 공을 다 넣음.
    - 만약 공이 이미 있는 바구니라면, 기존의 공을 버리고 새로 공을 집어넣음.
    
    // 1번째 줄 : N M
        - N = 바구니 갯수
        - M = 앞으로 공을 넣을 횟수.
    // 2번째 줄 ~ : i j k
        - i ~ j = i번 바구니부터 j번 바구니까지 범위 지정.
        - k = 범위 안의 바구니에 k번 번호가 적힌 공을 모두 넣음.
*/
