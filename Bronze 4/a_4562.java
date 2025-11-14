import java.io.*;
import java.util.StringTokenizer;

public class a_4562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++){
            String sen = br.readLine();
            StringTokenizer st = new StringTokenizer(sen);

            if (Integer.parseInt(st.nextToken()) >= Integer.parseInt(st.nextToken())){
                bw.write("MMM BRAINS\n");
            } else bw.write("NO BRAINS\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
