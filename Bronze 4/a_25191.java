import java.io.*;
import java.util.StringTokenizer;
public class a_25191 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public void run() throws Exception{
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        if ((a / 2) + b <= n) System.out.println((a / 2) + b);
        else System.out.println(n);
        br.close();
    }
    public static void main(String[] args) throws Exception{
        new a_25191().run();
    }
}
