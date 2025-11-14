// Clear
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class a_8545 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String sen = br.readLine();
        String[] senArr = sen.split("");
        for (int i = senArr.length - 1; i >= 0; i--){                               // sb.append(sen).reverse();
            sb.append(senArr[i]);                                                   
        }
        System.out.print(sb);
        br.close();
    }
}
