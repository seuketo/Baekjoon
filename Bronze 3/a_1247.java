import java.io.*;
import java.math.BigInteger;
public class a_1247 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    public void run() throws IOException{
        for (int i = 0; i < 3; i++){
            int n = Integer.parseInt(br.readLine());
            BigInteger s = BigInteger.ZERO;
            for (int j = 0; j < n; j++) s = s.add(BigInteger.valueOf(Long.parseLong(br.readLine())));
            if (s.compareTo(BigInteger.ZERO) > 0) sb.append("+\n");
            else if (s.compareTo(BigInteger.ZERO) == 0) sb.append("0\n");
            else sb.append("-\n");
        }
        System.out.print(sb);
        br.close();
    }
    public static void main(String[] args) throws IOException{
        new a_1247().run();
    }
}
