import java.io.*;
public class a_5354 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    public void run() throws IOException{
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++){
            int j = Integer.parseInt(br.readLine());
            for (int a = 0; a < j; a++) sb.append((a == 0 || a == j - 1) ? ("#".repeat(j) + "\n") : ("#" + "J".repeat(j - 2) + "#\n"));
            sb.append("\n");
        }
        System.out.print(sb);
        br.close();
    }
    public static void main(String[] args) throws IOException{
        new a_5354().run();
    }
}
