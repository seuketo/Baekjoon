import java.io.*;
import java.util.StringTokenizer;
public class a_9093 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    StringTokenizer st;
    public void run() throws IOException{
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++){
            st = new StringTokenizer(br.readLine());
            while (st.hasMoreTokens()){
                char[] arr = st.nextToken().toCharArray();
                for (int j = arr.length - 1; j >= 0; j--) sb.append(arr[j]);
                sb.append(" ");
            }
            sb.append("\n");
        }
        System.out.print(sb);
        br.close();
    }
    public static void main(String[] args) throws IOException{
        new a_9093().run();
    }
}
