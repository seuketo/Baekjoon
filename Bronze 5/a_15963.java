import java.io.*;
import java.util.StringTokenizer;
public class a_15963 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException{
        StringTokenizer st = new StringTokenizer(br.readLine());
        long n = Long.parseLong(st.nextToken());
        long m = Long.parseLong(st.nextToken());
        if (n == m) System.out.print(1);
        else System.out.print(0);
        br.close();
    }
}
