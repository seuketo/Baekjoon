import java.io.*;
public class a_2522 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public void run() throws IOException{
        int n = Integer.parseInt(br.readLine());
        for (int i = 1; i <= n; i++) System.out.println(" ".repeat(n - i) + "*".repeat(i));
        for (int i = 1; i <= n - 1; i++) System.out.println(" ".repeat(i) + "*".repeat(n - i));
        br.close();
    }
    public static void main(String[] args) throws IOException{
        new a_2522().run();
    }
}
