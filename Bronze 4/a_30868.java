import java.io.*;
public class a_30868 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    public void run() throws IOException{
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++){
            int num = Integer.parseInt(br.readLine());
            if (num < 5) sb.append("|".repeat(num)).append("\n");
            else sb.append("++++ ".repeat(num / 5)).append("|".repeat(num % 5)).append("\n");
        }
        System.out.print(sb);
        br.close();
    }
    public static void main(String[] args) throws IOException{
        new a_30868().run();
    }
}