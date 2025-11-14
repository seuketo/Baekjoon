import java.io.*;
import java.util.StringTokenizer;
public class a_28281{
    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private StringTokenizer st;
    public void run() throws IOException{
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        int min = Integer.MAX_VALUE;
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken()); 
        for (int i = 0; i < n - 1; i++){
            int cal = (arr[i] * x) + (arr[i + 1] * x);
            if (cal < min) min = cal;
        }
        System.out.println(min);
        br.close();
    }
    public static void main(String[] args) throws IOException{
        new a_28281().run();
    }
}
