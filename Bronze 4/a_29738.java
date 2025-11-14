import java.io.*;
public class a_29738 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    public void run() throws IOException{
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++){
            int n = Integer.parseInt(br.readLine()), round = 1, before = 0;
            while (round != 4){
                if (n <= 4500 && round == 1) round = 2;
                else if (n <= 1000 && round == 2) round = 3;
                else if (n <= 25 && round == 3) round = 4;
                else break;
            }
            if (round != 4) sb.append("Case #" + (i + 1) + ": Round " + round).append("\n");
            else sb.append("Case #" + (i + 1) + ": World Finals").append("\n");
        }
        System.out.print(sb);
        br.close();
    }
    public static void main(String[] args) throws IOException{
        new a_29738().run();
    }
}
