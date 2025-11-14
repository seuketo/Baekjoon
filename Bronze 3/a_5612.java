import java.io.*;
import java.util.StringTokenizer;
public class a_5612 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public void run() throws IOException{
        int n = Integer.parseInt(br.readLine());
        long m = Long.parseLong(br.readLine());
        long max = m;
        for (int i = 0; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            m += Integer.parseInt(st.nextToken());
            m -= Integer.parseInt(st.nextToken());
            if (m > max && max != Integer.MIN_VALUE) max = m;
            if (m < 0) max = Integer.MIN_VALUE;
        }
        if (max == Integer.MIN_VALUE) System.out.println(0);
        else System.out.println(max);
        br.close();
    }
    public static void main(String[] args) throws IOException{
        new a_5612().run();
    }
}
