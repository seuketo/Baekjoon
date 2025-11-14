import java.io.*;
import java.util.StringTokenizer;
public class a_4493 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    public void run() throws IOException{
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++){
            int[] score = new int[2];
            int n = Integer.parseInt(br.readLine());
            for (int j = 0; j < n; j++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                String a = st.nextToken(), b = st.nextToken();
                score[0] += rps(a, b);
                score[1] += rps(b, a);
            }
            if (score[0] > score[1]) sb.append("Player 1\n");
            else if (score[0] == score[1]) sb.append("TIE\n");
            else sb.append("Player 2\n");
        }
        System.out.print(sb);
        br.close();
    }
    public int rps(String a, String b){
        if (a.equals(b)) return 1;
        switch(a){
            case "R" :
                return (b.equals("P") ? 0 : 1);
            case "S" :
                return (b.equals("R") ? 0 : 1);
            case "P" :
                return (b.equals("S") ? 0 : 1);
            default :
                return -1;
        }
    }
    public static void main(String[] args) throws IOException{
        new a_4493().run();
    }
}
