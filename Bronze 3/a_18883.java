import java.io.*;
import java.util.StringTokenizer;
public class a_18883 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    public void run() throws IOException{
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
        int num = 1;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++) {
                if (j == m - 1) sb.append(num);
                else sb.append(num + " ");
                num++;
            }
            sb.append("\n"); 
        }
        System.out.print(sb);
        br.close();
    }
    public static void main(String[] args) throws IOException{
        new a_18883().run();
    }
}
