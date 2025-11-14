import java.io.*;
import java.util.*;
public class a_13420 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    StringBuilder sb = new StringBuilder();
    public void run() throws IOException {
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());
            long a = Long.parseLong(st.nextToken());
            String cal = st.nextToken();
            long b = Long.parseLong(st.nextToken());
            String same = st.nextToken();
            long c = Long.parseLong(st.nextToken());
            switch (cal) {
                case "+":
                    if (a + b == c) sb.append("correct");
                    else sb.append("wrong answer");
                    break;

                case "-":
                    if (a - b == c) sb.append("correct");
                    else sb.append("wrong answer");
                    break;

                case "*":
                    if (a * b == c) sb.append("correct");
                    else sb.append("wrong answer");
                    break;

                case "/":
                    if (a / b == c) sb.append("correct");
                    else sb.append("wrong answer");
                    break;

                default:
                    break;
            }
            if (t > 0) sb.append("\n");
        }
        System.out.println(sb);
        br.close();
    }
    public static void main(String[] args) throws IOException {
        try{
            new a_13420().run();
        } catch (IOException e){
            System.err.println(e.getMessage());
        }
    }
}