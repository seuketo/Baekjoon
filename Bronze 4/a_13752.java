import java.io.*;
public class a_13752 {
    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private StringBuilder sb = new StringBuilder();
    public void run() throws Exception{
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++){
            int k = Integer.parseInt(br.readLine());
            for (int j = 0; j < k; j++) sb.append("=");
            sb.append("\n");
        }
        System.out.print(sb);
        br.close();
    }
    public static void main(String[] args) throws Exception{
        new a_13752().run();
    }
}