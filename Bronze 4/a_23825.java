import java.io.*;
import java.util.StringTokenizer;
public class a_23825 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public void run() throws IOException{
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
        if (n <= m) System.out.println(n / 2);
        else System.out.println(m / 2);
        br.close();
    }
    public static void main(String[] args) throws IOException{
        new a_23825().run();
    }
}
