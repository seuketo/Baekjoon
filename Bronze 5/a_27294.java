import java.io.*;
import java.util.StringTokenizer;
public class a_27294 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int t = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());
        if (t >= 12 && t <= 16 && s == 0) sb.append(320);
        else if (t <= 12 || t >= 16 || s == 1) sb.append(280);
        System.out.print(sb);
        br.close();
    }
}
