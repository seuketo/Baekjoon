import java.io.*;
import java.util.StringTokenizer;
public class a_27959 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        if (n * 100 >= m) sb.append("Yes");
        else sb.append("No");
        System.out.print(sb);
    }
}
