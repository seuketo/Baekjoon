import java.io.*;
import java.util.StringTokenizer;
public class a_5523 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public void run() throws IOException{
        int n = Integer.parseInt(br.readLine());
        int[] score = new int[2];
        for (int i = 0; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
            if (a > b) score[0]++;
            else if (a == b) continue;
            else score[1]++;
        }
        System.out.println(score[0] + " " + score[1]);
        br.close();
    }
    public static void main(String[] args) throws IOException{
        new a_5523().run();
    }
}
