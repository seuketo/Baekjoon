import java.io.*;
public class a_10990 {
    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private StringBuilder sb = new StringBuilder();
    public void run() throws IOException{
        int n = Integer.parseInt(br.readLine());
        int num = 1;
        int count = n;
        for (int i = 0; i < n; i++){
            if (i == 0) sb.append(" ".repeat(count - 1)).append("*");
            else {
                sb.append(" ".repeat(count - 1)).append("*").append(" ".repeat(num)).append("*");
                num += 2;
            }
            count--;
            sb.append("\n");
        }
        System.out.print(sb);
        br.close();
    }
    public static void main(String[] args) throws IOException{
        new a_10990().run();
    }
}
