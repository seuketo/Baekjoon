import java.io.*;
import java.util.StringTokenizer;
public class a_27110 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public void run() throws Exception{
        int n = Integer.parseInt(br.readLine());
        int count = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 3; i++){
            int a = Integer.parseInt(st.nextToken());
            if (a > n) count += n;
            else count += a;
        }
        System.out.println(count);
        br.close();
    }
    public static void main(String[] args) throws Exception{
        new a_27110().run();
    }
}
