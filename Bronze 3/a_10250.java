import java.io.*;
import java.util.StringTokenizer;
public class a_10250 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int h_index = 1;
            int w_index = 1;
            int h = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());
            for (int j = 1; j < n; j++){
                if (h_index == h){
                    h_index = 1;
                    w_index++;
                } else h_index++;
            }
            if (w_index <= 9) sb.append(Integer.toString(h_index) + "0" + Integer.toString(w_index) + "\n");
            else sb.append(Integer.toString(h_index) + Integer.toString(w_index) + "\n");
        }
        System.out.print(sb);
        br.close();
    }
}
