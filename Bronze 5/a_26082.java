import java.io.*;
import java.util.StringTokenizer;
public class a_26082 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public void run() throws IOException{
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken()), c = Integer.parseInt(st.nextToken());
        System.out.println((b / a) * 3 * c);
        br.close();
    }
    public static void main(String[] args) throws IOException{
        new a_26082().run();
    }
}
