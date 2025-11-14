import java.io.*;
public class a_10992 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    public void run() throws IOException{
        int n = Integer.parseInt(br.readLine());
        int len = n;
        int count = n - 1;
        for (int i = 0; i < n; i++){
            if (len == n) sb.append(" ".repeat(count)).append("*").append("\n"); 
            else if (len > n && len < (2 * n) - 1) sb.append(" ".repeat(count)).append("*").append(" ".repeat(len - (count + 2))).append("*").append("\n");
            else sb.append("*".repeat((2 * n) - 1)).append("\n");
            count--; 
            len++;
        }
        System.out.print(sb);
        br.close();
    }
    public static void main(String[] args) throws IOException{
        new a_10992().run();
    }
}

/*
  *
 * *
*****
 */