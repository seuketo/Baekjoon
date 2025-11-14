import java.io.*;
import java.util.StringTokenizer;
public class a_30031 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public void run() throws Exception{
        int n = Integer.parseInt(br.readLine());
        int sum = 0;
        for (int i = 0; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int length = Integer.parseInt(st.nextToken());
            if (length == 136) sum += 1000;
            else if (length == 142) sum += 5000;
            else if (length == 148) sum += 10000;
            else sum += 50000;
        }
        System.out.println(sum);
        br.close();
    }
    public static void main(String[] args) throws Exception{
        new a_30031().run();
    }
}
