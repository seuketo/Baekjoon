import java.io.*;
import java.util.StringTokenizer;
public class a_15786 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    public void run() throws IOException{
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
        char[] arr = (br.readLine()).toCharArray();
        for (int i = 0; i < m; i++){
            int index = 0, count = 0;
            char[] ch = (br.readLine()).toCharArray();
            for (int j = 0; j < ch.length; j++){
                if (count == n) break;
                if (ch[j] == arr[index]){
                    index++;
                    count++;
                }
            }
            if (count == n) sb.append("true\n");
            else sb.append("false\n");
        }
        System.out.print(sb);
        br.close();
    }
    public static void main(String[] args) throws IOException{
        new a_15786().run();
    }
}
