import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class a_21598 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    public void run() throws IOException{
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) sb.append("SciComLove").append("\n");
        System.out.print(sb);
        br.close();
    }
    public static void main(String[] args) throws IOException{
        new a_21598().run();
    }
}
