import java.io.*;
import java.util.StringTokenizer;
public class a_2490{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    public void run() throws IOException{
        int zero, one;
        for (int i = 0; i < 3; i++){
            zero = 0;
            one = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 4; j++){
                int n = Integer.parseInt(st.nextToken());
                if (n == 0) zero++;
                if (n == 1) one++;
            }
            if (zero == 1 && one == 3) sb.append("A\n");
            else if (zero == 2 && one == 2) sb.append("B\n");
            else if (zero == 3 && one == 1) sb.append("C\n");
            else if (zero == 4) sb.append("D\n");
            else if (one == 4) sb.append("E\n");
        }
        System.out.print(sb);
        br.close();
    }
    public static void main(String[] args) throws IOException{
        new a_2490().run();
    }
}