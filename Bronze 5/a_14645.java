import java.io.*;
import java.util.StringTokenizer;
public class a_14645{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        for (int i = 0; i < n; i++) br.readLine();
        System.out.print("비와이");
        br.close();
    }
}