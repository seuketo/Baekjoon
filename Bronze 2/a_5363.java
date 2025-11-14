import java.io.*;
import java.util.StringTokenizer;
public class a_5363 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    StringBuilder sb = new StringBuilder();
    public void run() throws IOException{
        int n = Integer.parseInt(br.readLine());
        while (n --> 0){
            st = new StringTokenizer(br.readLine());
            String first = st.nextToken();
            String second = st.nextToken();
            while (st.hasMoreTokens()){
                String sen = st.nextToken();
                sb.append(sen + " ");
            }
            sb.append(first + " " + second + "\n");
        }
        System.out.print(sb);
        br.close();

    }
    public static void main(String[] args) throws IOException{
        new a_5363().run();
    }
}
