import java.io.*;
import java.util.StringTokenizer;

public class a_4299 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken()); // 합
        int b = Integer.parseInt(st.nextToken()); // 차
        if (a <= 1000 && b <= 1000 && a >= 0 && b >= 0 && a >= b){   // 합과 차는 1000보다 작거나 같은 음이 아닌 정수이고, 합은 차보다 크거나 같다.
            if ((a - b) % 2 == 0 && (a + b) % 2 == 0) System.out.printf("%d %d", (a + b) / 2, (a - b) / 2);
            else System.out.println(-1);
        } else System.out.println(-1);
        br.close();
    }
}
