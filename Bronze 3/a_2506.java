import java.io.*;
import java.util.StringTokenizer;
public class a_2506 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public void run() throws IOException{
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int count = 0, total = 0;
        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(st.nextToken());
            if (a == 1){
                count++;
                total += count;
            } else count = 0;
        }
        System.out.println(total);
        br.close();
    }
    public static void main(String[] args) throws IOException{
        new a_2506().run();
    }
}
