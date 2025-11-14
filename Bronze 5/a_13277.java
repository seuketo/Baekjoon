import java.io.*;
import java.util.StringTokenizer;
import java.math.BigInteger;
public class a_13277 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BigInteger a = new BigInteger(st.nextToken());
        BigInteger b = new BigInteger(st.nextToken());
        System.out.print(a.multiply(b).toString());
        br.close();
    }
}
