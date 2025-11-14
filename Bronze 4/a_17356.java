import java.io.*;
import java.util.StringTokenizer;
import java.math.BigDecimal;
public class a_17356 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    public void run() throws Exception{
        st = new StringTokenizer(br.readLine());
        double A = Integer.parseInt(st.nextToken());
        double B = Integer.parseInt(st.nextToken());

        double M = (B - A) / 400;
        double vict = 1.0 / (1.0 + Math.pow(10, M));
        System.out.println(BigDecimal.valueOf(vict).toPlainString());
        br.close();
    }
    public static void main(String[] args) throws Exception{
        new a_17356().run();
    }
}
/*
 - A = 욱 욱제력
 - B = 제 욱제력
 - M = (B - A) / 400
 - 욱이 이길 확률 = 1 / (1 + 10^M)

 3015 - 1655 = 1360
 1360 / 400 = 3.4
 1 / 10^3.4
 */