import java.io.*;
import java.util.StringTokenizer;
public class a_2869 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public void run() throws IOException{
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken()), v = Integer.parseInt(st.nextToken());
        int total = (v - a) / (a - b);
        if (v - (total * (a - b)) <= a) total++;
        else total += 2;
        System.out.println(total);
        br.close();
    }
    public static void main(String[] args) throws IOException{
        new a_2869().run();
    }
}
