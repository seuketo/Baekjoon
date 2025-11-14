import java.io.*;
import java.util.StringTokenizer;
public class a_2525{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public void run() throws IOException{
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken()) + Integer.parseInt(br.readLine());
            if (b >= 60) {
                a += b / 60;
                b %= 60;
            }
            if (a >= 24) a %= 24;
        System.out.println(a + " " + b);
        br.close();
    }
    public static void main(String[] args) throws IOException{
        new a_2525().run();
    }
}