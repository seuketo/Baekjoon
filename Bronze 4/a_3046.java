import java.io.*;
import java.util.StringTokenizer;
public class a_3046 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int r1 = Integer.parseInt(st.nextToken());
        System.out.println(Integer.parseInt(st.nextToken()) * 2 - r1);
        br.close();
    }
}
