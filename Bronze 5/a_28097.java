import java.io.*;
import java.util.StringTokenizer;
public class a_28097 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public void run() throws Exception{
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int sum = 0;
        for (int i = 0; i < n; i++) sum += Integer.parseInt(st.nextToken());
        sum += (n - 1) * 8;
        System.out.println((sum / 24) + " " + sum % 24);
        br.close();
    }
    public static void main(String[] args) throws Exception{
        new a_28097().run();
    }
}
