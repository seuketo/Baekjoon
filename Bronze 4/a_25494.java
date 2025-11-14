import java.io.*;
import java.util.StringTokenizer;
public class a_25494 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    StringTokenizer st;
    public void run() throws Exception{
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            int min = 0;
            if (a > b){
                if (b > c) min = c;
                else min = b;
            } else {
                if (a > c) min = c;
                else min = a;
            }
            sb.append(min).append("\n"); 
        }
        System.out.print(sb);
        br.close();
    }
    public static void main(String[] args) throws Exception{
        new a_25494().run();
    }
}
