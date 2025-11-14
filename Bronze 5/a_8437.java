import java.io.*;
import java.math.BigInteger;

public class a_8437 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BigInteger total = new BigInteger(br.readLine());
        BigInteger much = new BigInteger(br.readLine());
        BigInteger diff = total.subtract(much).divide(BigInteger.TWO);

        System.out.printf("%d\n%d", diff.add(much), diff);
        br.close();
    }
}