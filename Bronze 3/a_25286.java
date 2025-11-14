import java.io.*;
import java.util.StringTokenizer;
public class a_25286{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    public void run() throws IOException{
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int y = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int d = 0;
            m--;
            if (m == 0){
                y--;
                m = 12;
            }
            if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) d = 31;
            else if (m == 4 || m == 6 || m == 9 || m == 11) d = 30;
            else if ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0){
                if (m == 2) d = 29;
            } else if (m == 2) d = 28;

            sb.append(y + " " + m + " " + d + "\n");
        }
        System.out.print(sb);
        br.close();
    }
    public static void main(String[] args) throws IOException{
        new a_25286().run();
    }
}