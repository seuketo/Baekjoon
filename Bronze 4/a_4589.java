import java.io.*;
import java.util.StringTokenizer;
public class a_4589 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        sb.append("Gnomes:\n");
        for (int i = 0; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            if ((a >= b && b >= c) || (a <= b && b <= c)){
                sb.append("Ordered\n");
            } else sb.append("Unordered\n");
        }
        System.out.print(sb);
        br.close();
    }
}