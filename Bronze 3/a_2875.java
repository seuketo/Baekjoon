import java.io.*;
import java.util.StringTokenizer;
public class a_2875 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public void run() throws IOException{
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int nm = 0;
        if ((n / 2) <= m) {
            nm = (n / 2) * 2;
            n -= n / 2 * 2;
            m -= n / 2;
        }
        else {
            nm = m * 2;
            n -= 2 * m;
            m -= m;
        }
        System.out.println(nm);
        if (k <= n + m) System.out.println(nm);
        else {
            nm--;
            if (nm <= 0) System.out.println(0);
            else System.out.println(nm);
        }
        br.close();
    }
    public static void main(String[] args) throws IOException{
        new a_2875().run()
    }
}
