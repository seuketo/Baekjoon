import java.io.*;
import java.util.StringTokenizer;
public class a_25304 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public void run() throws Exception{
        int x = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            x -= Integer.parseInt(st.nextToken()) * Integer.parseInt(st.nextToken());
        }
        if (x == 0) System.out.println("Yes");
        else System.out.println("No");
        br.close();
    }
    public static void main(String[] args) throws Exception{
        new a_25304().run();
    }
}
