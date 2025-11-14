import java.io.*;
import java.util.StringTokenizer;
public class a_13136 {
    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private StringTokenizer st;
    private StringBuilder sb = new StringBuilder();
    public void run() throws Exception{
        st = new StringTokenizer(br.readLine());
        long r = Long.parseLong(st.nextToken());
        long c = Long.parseLong(st.nextToken());
        long n = Long.parseLong(st.nextToken());
        if (r % n > 0 && c % n > 0) sb.append(((r / n) + 1) * ((c / n) + 1));
        else {
            if ((r % n > 0 && c % n == 0)) sb.append(((r / n) + 1) * (c / n));
            else if (r % n == 0 && c % n > 0) sb.append((r / n) * ((c / n) + 1));
            else sb.append((r / n) * (c / n));
        }
        System.out.println(sb);
        br.close();
    }
    public static void main(String[] args) throws Exception{
        new a_13136().run();
    }
}
