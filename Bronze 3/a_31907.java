import java.io.*;
public class a_31907 {
    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private StringBuilder sb = new StringBuilder();
    public void run() throws IOException{
        int k = Integer.parseInt(br.readLine());
        int len = k * 4;
        for (int i = 0; i < k; i++) sb.append("G".repeat(k)).append(".".repeat(len - k)).append("\n");
        for (int i = 0; i < k; i++) sb.append(".".repeat(k)).append("I".repeat(k)).append(".".repeat(k)).append("T".repeat(k)).append("\n");
        for (int i = 0; i < k; i++) sb.append(".".repeat(len / 2)).append("S".repeat(k)).append(".".repeat(k)).append("\n");
        System.out.print(sb);
        br.close();
    }
    public static void main(String[] args) throws IOException{
        new a_31907().run();
    }
}
