import java.io.*;
import java.util.StringTokenizer;
public class a_13118 {
    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private StringTokenizer st;
    public void run() throws Exception{
        String sen = br.readLine();
        int index = 0;
        st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(sen);
        for (int i = 0; i < 4; i++){
            int n = Integer.parseInt(st.nextToken());
            if (n == x) index = i + 1;
        }
        System.out.println(index);
        br.close();
    }
    public static void main(String[] args) throws Exception {
        new a_13118().run();
    }
}
