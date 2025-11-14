import java.io.*;
import java.util.StringTokenizer;
public class a_14924 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    public void run() throws Exception{
        st = new StringTokenizer(br.readLine());
        int s = Integer.parseInt(st.nextToken());
        int t = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        System.out.println((d / (2 * s)) * t);
        br.close();
    }
    public static void main(String[] args) throws Exception{
        new a_14924().run();
    }
}
