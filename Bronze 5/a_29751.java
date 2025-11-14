import java.io.*;
import java.util.StringTokenizer;
public class a_29751 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());
        System.out.printf("%.1f", w * h * 0.5);
        br.close();
    }
}
