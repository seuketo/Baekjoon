import java.io.*;
import java.util.StringTokenizer;
public class a_10797{
    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private StringTokenizer st;
    public void run() throws Exception{
        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int count = 0;
        for (int i = 0; i < 5; i++) if (n == Integer.parseInt(st.nextToken())) count++;
        System.out.print(count);
        br.close();
    }
    public static void main(String[] args) throws Exception{
        new a_10797().run();
    }
}
