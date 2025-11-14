import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class a_5341 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int a;
        while ((a = Integer.parseInt(br.readLine())) != 0){
            int i = a;
            int result = 0;
            while (i != 0){
                result += i;
                i--;
            }
            sb.append(result).append("\n");
        }
        System.out.print(sb);
        br.close();
    }
}
