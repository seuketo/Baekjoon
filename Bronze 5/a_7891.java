// Clear
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.math.BigInteger;
import java.io.IOException;


public class a_7891 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int count = Integer.parseInt(br.readLine());
        int i = 0;
        while (true){
            if (i == count) break;
            String sen = br.readLine();
            StringTokenizer st = new StringTokenizer(sen);
            BigInteger a = new BigInteger(st.nextToken());
            BigInteger b = new BigInteger(st.nextToken());
            sb.append(a.add(b)).append("\n");
            i++;
        }
        System.out.print(sb);
        br.close();
    }
}
