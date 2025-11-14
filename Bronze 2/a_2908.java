import java.io.*;
import java.util.StringTokenizer;
public class a_2908{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    public void run() throws IOException{
        StringTokenizer st = new StringTokenizer(br.readLine());
        sb.append(st.nextToken());
        int a = Integer.parseInt(sb.reverse().toString());
        sb.setLength(0);
        sb.append(st.nextToken());
        int b = Integer.parseInt(sb.reverse().toString());
        if (a > b) System.out.println(a);
        else System.out.println(b);
        br.close();
    }
    public static void main(String[] args) throws IOException{
        new a_2908().run();
    }
}