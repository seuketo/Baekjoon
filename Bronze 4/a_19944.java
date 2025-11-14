import java.io.*;
import java.util.StringTokenizer;
public class a_19944 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public void run() throws Exception{
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        if (m <= n && m <= 2) System.out.println("NEWBIE!");
        else if (m <= n && m > 2) System.out.println("OLDBIE!");
        else System.out.println("TLE!");
        br.close();
    }
    public static void main(String[] args) throws Exception{
        new a_19944().run();
    }
}
