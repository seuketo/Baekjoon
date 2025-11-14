import java.io.*;
import java.util.StringTokenizer;
public class a_10813 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    StringBuilder sb = new StringBuilder();
    public void run() throws IOException{
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = i + 1;
        for (int i = 1; i <= m; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
            int pivot = arr[a - 1];
            arr[a - 1] = arr[b - 1];
            arr[b - 1] = pivot;
        }
        for (int a : arr) sb.append(a + " ");
        System.out.println(sb);
        br.close();
    }
    public static void main(String[] args) throws IOException{
        new a_10813().run();
    }
}

/* 
 - 도현이는 N개의 바구니를 소유.
    - 각각의 바구니에는 1 ~ N까지의 번호 부여.
 - 가장 처음 바구니에는 바구니 번호와 동일한 공을 가짐.
 - 공을 M번 바꿈. 
    - 바꿀 바구니 2개를 고르고, 해당 바구니 2개에 들어있는 공을 서로 바꿈.
    // 1번째 줄 : N M
        - N = 바구니 갯수
        - M = 앞으로 공을 넣을 횟수.
    // 2번째 줄 ~ : i j
        - i ~ j = i번 바구니부터 j번 바구니까지 범위 지정 후 공 교환.
*/