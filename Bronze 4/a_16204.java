import java.io.*;
import java.util.StringTokenizer;
public class a_16204 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public void run() throws Exception{
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int ocount = (m >= k ? k : m);
        int xcount = (n-m >= n-k ? n-k : n-m);
        System.out.println(ocount + xcount);
        br.close();
    }
    public static void main(String[] args) throws Exception{
        new a_16204().run();
    }
}
