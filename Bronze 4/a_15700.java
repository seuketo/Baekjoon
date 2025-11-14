import java.io.*;
import java.util.StringTokenizer;
public class a_15700 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public void run() throws Exception{
        StringTokenizer st = new StringTokenizer(br.readLine());
        long n = Long.parseLong(st.nextToken());
        long m = Long.parseLong(st.nextToken());
        System.out.println((n * m) / 2);
        br.close();
    }
    public static void main(String args[]) throws Exception{
        new a_15700().run();
    }
}
