import java.io.*;
import java.util.*;

public class a_2839{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final int INF = 1_000_000_000;
    public void run() throws IOException{
        int n = Integer.parseInt(br.readLine());
        int[] dp = new int[n + 1];
        Arrays.fill(dp, INF);
        if(n <= 5){
            if (n == 3 || n == 5) System.out.println(1);
            else System.out.println(-1);
        } else{
            dp[0] = 0;
            for (int i = 1; i <= n; i++){
                dp[i] = INF;
                if (i >= 3 && dp[i - 3] != INF){
                    dp[i] = Math.min(dp[i], dp[i - 3] + 1);
                }
                if (i >= 5 && dp[i - 5] != INF){
                    dp[i] = Math.min(dp[i], dp[i - 5] + 1);
                }
            }
            if (dp[n] == INF) System.out.println(-1);
            else System.out.println(dp[n]);
        }
        br.close();
    }
    public static void main(String[] args) throws IOException{
        try{
            new a_2839().run();
        } catch (IOException e){
            System.err.println(e.getMessage());
        }
    }
}