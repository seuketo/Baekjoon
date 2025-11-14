import java.io.*;
import java.util.StringTokenizer;
public class a_1267{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    public void run() throws IOException{
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int y = 0, m = 0;
        for (int i = 0; i < n; i++){
            int num = Integer.parseInt(st.nextToken());
            y += 10 * ((num / 30) + 1);
            m += 15 * ((num / 60) + 1); 
        }
        if (y > m) sb.append("M " + m);
        else if (y == m) sb.append("Y M " + y);
        else sb.append("Y " + y);
        System.out.println(sb);
        br.close();
    }
    public static void main(String[] args) throws IOException{
        new a_1267().run();
    }
}