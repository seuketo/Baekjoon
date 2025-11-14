import java.io.*;
import java.util.StringTokenizer;
public class a_2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int num = Integer.parseInt(br.readLine());
        for (int i = 0; i < num; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            String[] sen = (st.nextToken()).split("");
            for (int j = 0; j < sen.length; j++){
                for (int x = 0; x < a; x++){
                    sb.append(sen[j]);
                }
            }
            sb.append("\n");
        }
        System.out.print(sb);
        br.close();
    }
}
