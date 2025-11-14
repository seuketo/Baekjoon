import java.io.*;

public class a_4470 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        for (int i = 1; i <= N; i++){
            String sen = br.readLine();
            sb.append(i + ". " + sen + "\n");
        }
        System.out.print(sb);
        br.close();
    }
}