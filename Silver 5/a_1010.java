// couldn't solve
import java.util.StringTokenizer;
import java.io.*;
public class a_1010 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            int count = 0;
            int num = 0;
            for (int j = 1; j <= N; j++){
                for (int k = 1; k <= M; k++){
                    if (j == 1) count = M;
                    else if (j < k) {
                        count *= (M - num);
                        num++;
                    } else if (j > k) continue;
                }
            }
            bw.write(count + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
