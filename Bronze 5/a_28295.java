import java.io.*;
public class a_28295 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    public void run() throws Exception{
        int degree = 0;
        for (int i = 0; i < 10; i++){
            int t = Integer.parseInt(br.readLine());
            if (t == 1) degree += 90;
            else if (t == 2) degree += 180;
            else degree -= 90;
        }
        if (degree < 0) {
            degree *= -1;
            if (degree > 360) degree %= 360;
        }
        else if (degree > 360) degree %= 360;
        if (degree == 0 || degree == 360) sb.append("N");
        else if (degree == 90) sb.append("E");
        else if (degree == 180) sb.append("S");
        else sb.append("W");
        System.out.println(sb);
        br.close();
    }
    public static void main(String[] args) throws Exception{
        new a_28295().run();
    }
}
