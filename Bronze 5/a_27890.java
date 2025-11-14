import java.io.*;
import java.util.StringTokenizer;
public class a_27890 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public void run() throws Exception{
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int xt1 = 0;
        if (n == 0) xt1 = x;
        else{
            for (int i = 1; i <= n; i++){
                if (i == 1){
                    if (x % 2 == 0) xt1 = (int) Math.floor(x / 2) ^ 6;
                    else xt1 = (2 * x) ^ 6;
                } else{
                    if (xt1 % 2 == 0) xt1 = (int) Math.floor(xt1 / 2) ^ 6;
                    else xt1 = (2 * xt1) ^ 6;
                }
            }
        }
        System.out.println(xt1);
        br.close();
    }
    public static void main(String[] args) throws Exception{
        new a_27890().run();
    }
}
