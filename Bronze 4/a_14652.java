import java.io.*;
import java.util.StringTokenizer;
public class a_14652 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    public void run() throws Exception{
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        System.out.println(k / m + " " + k % m);
        br.close();
    }
    public static void main(String[] args) throws Exception{
        new a_14652().run();
    }
}
