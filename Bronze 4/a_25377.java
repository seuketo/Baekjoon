import java.io.*;
import java.util.StringTokenizer;
public class a_25377 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public void run() throws Exception{
        int n = Integer.parseInt(br.readLine());
        int min_time = Integer.MAX_VALUE;
        boolean tf = false;
        for (int i = 0; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if (a <= b){
                if (b <= min_time) {
                    min_time = b;
                    tf = true;
                }
            }
        }
        if (tf == false) System.out.println(-1);
        else System.out.println(min_time);
        br.close();
    }
    public static void main(String[] args) throws Exception{
        new a_25377().run();
    }
}
