// Clear
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class a_5522 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        for (int i = 0; i < 5; i++){
            int a = Integer.parseInt(br.readLine());
            if (a >= 0 && a <= 100) sum += a;
        }
        System.out.println(sum);
        br.close();
    }
}
