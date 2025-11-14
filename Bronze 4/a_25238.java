import java.io.*;
import java.util.StringTokenizer;
public class a_25238 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public void run() throws Exception{
        StringTokenizer st = new StringTokenizer(br.readLine());
        double a = Integer.parseInt(st.nextToken());
        double b = Integer.parseInt(st.nextToken());
        double res = a - (a / 100 * b);
        if (res >= 100) System.out.println(0);
        else System.out.println(1);
        br.close();
    }
    public static void main(String[] args) throws Exception{
        new a_25238().run();
    }
}