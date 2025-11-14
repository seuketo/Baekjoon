import java.io.*;
import java.util.StringTokenizer;
public class a_10156 {
    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private StringTokenizer st;
    private StringBuilder sb = new StringBuilder();
    public void run() throws Exception{
        st = new StringTokenizer(br.readLine());
        int[] arr = new int[3];
        for (int i = 0; i < 3; i++) arr[i] = Integer.parseInt(st.nextToken());
        int result = (arr[0] * arr[1]) - arr[2];
        if (result >= 0 ) sb.append(result);
        else sb.append(0);
        System.out.print(sb);
        br.close(); 
    }
    public static void main(String[] args) throws Exception{
        new a_10156().run();
    }
}
