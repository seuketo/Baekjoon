import java.io.*;
import java.util.StringTokenizer;
public class a_19698 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public void run() throws Exception{
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());
        int result = (w / l) * (h / l);
        if (result <= n) System.out.println(result);
        else System.out.println(n);
        br.close();
    }
    public static void main(String[] args) throws Exception{
        new a_19698().run();
    }
}
