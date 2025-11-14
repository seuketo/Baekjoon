import java.io.*;
import java.util.StringTokenizer;

public class a_2083{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String sen;
        while (!((sen = br.readLine()).equals("# 0 0"))){
            StringTokenizer st = new StringTokenizer(sen);
            String name = st.nextToken();
            if (Integer.parseInt(st.nextToken()) > 17 || Integer.parseInt(st.nextToken()) >= 80) sb.append(name + " Senior\n");
            else sb.append(name + " Junior\n");
        }
        System.out.println(sb);
        br.close();
    }
}