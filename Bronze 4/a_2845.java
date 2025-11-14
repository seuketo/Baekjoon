import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.math.BigInteger;

public class a_2845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BigInteger LP = new BigInteger(Integer.toString(Integer.parseInt(st.nextToken()) * Integer.parseInt(st.nextToken())));

        st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens() != false){
            BigInteger a = new BigInteger(st.nextToken());
            bw.write((a.subtract(LP)).toString() + " ");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
