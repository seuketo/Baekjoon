import java.io.*;
import java.util.StringTokenizer;
public class a_17388 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public void run() throws Exception{
        StringTokenizer st = new StringTokenizer(br.readLine());
        int s = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());
        if ((s + k + h) >= 100) System.out.println("OK");
        else{
            if (s >= k) {
                if (k >= h) System.out.println("Hanyang");
                else System.out.println("Korea");
            } else{
                if (s <= h) System.out.println("Soongsil");
                else System.out.println("Hanyang");
            }
        }
        br.close();
    }
    public static void main(String[] args) throws Exception{
        new a_17388().run();
    }
}
