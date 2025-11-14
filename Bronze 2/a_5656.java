import java.io.*;
import java.util.StringTokenizer;
public class a_5656 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    StringTokenizer st;
    public void run() throws IOException{
        int index = 1;
        while (true){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            String sen = st.nextToken();
            int b = Integer.parseInt(st.nextToken());
            if (sen.equals("E")) break;
            sb.append("Case " + index + ": ");
            switch (sen){
                case ">":
                    sb.append(a > b);
                    break;
                case ">=":
                    sb.append(a >= b);
                    break;
                case "<":
                    sb.append(a < b);
                    break;
                case "<=":
                    sb.append(a <= b);
                    break;
                case "==":
                    sb.append(a == b);
                    break;
                case "!=":
                    sb.append(a != b);
                    break;
            }
            sb.append("\n");
            index++;
        }
        System.out.print(sb);
        br.close();
    }
    public static void main(String[] args) throws IOException{
        new a_5656().run();
    }
}
