import java.io.*;
import java.util.StringTokenizer;
public class a_25625 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public void run() throws Exception{
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        if (y > x && y / x != 0) System.out.println(y - x);
        else if (y > x && y / x == 0) System.out.println(0);
        else System.out.println(y + x);
        br.close();
    }
    public static void main(String[] args) throws Exception{
        new a_25625().run();
    }
}
