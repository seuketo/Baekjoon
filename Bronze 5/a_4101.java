// Clear
import java.io.*;
import java.util.StringTokenizer;

public class a_4101 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String sen;
        while ((sen = br.readLine()) != null){
            StringTokenizer st = new StringTokenizer(sen);
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if (a == 0 && b == 0) break;
            else{
                if (a > b) sb.append("Yes");
                else sb.append("No");
                sb.append("\n");
            }
        }
        System.out.print(sb);
        br.close();
    }
}
