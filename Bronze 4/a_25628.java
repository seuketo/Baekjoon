import java.io.*;
import java.util.StringTokenizer;
public class a_25628 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public void run() throws Exception{
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int count = 0;
        while (true){
            if (a < 2 || b == 0) break;
            a -= 2;
            b--;
            count++;
        }
        System.out.println(count);
        br.close();
    }
    public static void main(String[] args) throws Exception{
        new a_25628().run();
    }
}
