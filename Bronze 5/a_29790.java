import java.io.*;
import java.util.StringTokenizer;
public class a_29790 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public void run() throws Exception{
        StringTokenizer st = new StringTokenizer(br.readLine());
        if (Integer.parseInt(st.nextToken()) >= 1000) {
            if (Integer.parseInt(st.nextToken()) >= 8000 || Integer.parseInt(st.nextToken()) >= 260) System.out.println("Very Good");
            else System.out.println("Good");
        }
        else System.out.println("Bad");
        br.close();
    }
    public static void main(String[] args) throws Exception{
        new a_29790().run();
    }
}
