import java.io.*;
import java.util.StringTokenizer;
public class a_29736 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public void run() throws Exception{
        StringTokenizer st = new StringTokenizer(br.readLine() + " " + br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        int total = 0;
        if (k >= a && k <= b){
            if (k - x >= a) total += x + 1;
            else total += a - k + 1;
            if (k + x <= b) total += x;
            else total += b - k;
        }
        if (total != 0) System.out.println(total);
        else System.out.println("IMPOSSIBLE");
        br.close();
    }
    public static void main(String[] args) throws Exception{
        new a_29736().run();
    }
}
