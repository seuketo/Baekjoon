import java.io.*;
import java.util.StringTokenizer;
public class a_11021 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        for (int i = 1; i <= t; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            sb.append("Case #" + i + ": " + (Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())) + "\n");
        }
        System.out.print(sb);
        br.close();
    }
}
