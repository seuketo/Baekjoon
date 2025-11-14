import java.io.*;
public class a_2442 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public void run() throws IOException{
        int n = Integer.parseInt(br.readLine());
        int outcount = 0;
        for (int i = 1; i <= n; i++){
            System.out.println(" ".repeat(n - i) + "*".repeat(i) + "*".repeat(outcount));
            outcount++;
        }
        br.close();
    }
    public static void main(String[] args) throws IOException{
        new a_2442().run();
    }
}
