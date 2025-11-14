import java.io.*;
import java.util.StringTokenizer;
public class a_2914 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public void run() throws IOException{
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
        System.out.println(a * (b - 1) + 1);
        br.close();
    }
    public static void main(String[] args) throws IOException{
        new a_2914().run();
    }
}
 