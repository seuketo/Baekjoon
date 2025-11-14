import java.io.*;
public class a_2446 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public void run() throws IOException{
        int n = Integer.parseInt(br.readLine());
        int outcount = 0;
        for (int i = 1; i <= n * 2 - 1; i++){
            if (i == 1) {
                System.out.println(" ".repeat(outcount) + "*".repeat(n - outcount) + "*".repeat(n - 1 - outcount));
                continue;
            }
            else if (i <= n) outcount++;
            else outcount--;
            System.out.println(" ".repeat(outcount) + "*".repeat(n - outcount) + "*".repeat(n - 1 - outcount));
        }
    }
    public static void main(String[] args) throws IOException{
        new a_2446().run();
    }
}
