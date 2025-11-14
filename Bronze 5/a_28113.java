import java.io.*;
import java.util.StringTokenizer;
public class a_28113 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(st.nextToken());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        if (n <= b)
            if (a > b) sb.append("Subway");
            else if (a < b) sb.append("Bus");
            else sb.append("Anything");
        else sb.append("Bus");
        System.out.print(sb);
        br.close();
    }
}
