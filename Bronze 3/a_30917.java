import java.io.*;
public class a_30917 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    public void run() throws IOException{
        int a = 0, b = 0, index = 1, count = 0;
        while (true){
            br.readLine();
            if (a == 0) sb.append("? A " + index).append("\n");
            else if (a != 0 && b == 0) sb.append("? B " + index).append("\n");
            sb.append("\n");
            int value = Integer.parseInt(br.readLine());
            if (value == 0) {
                count++;
                index++;
                continue;
            }
            else if (value == 1){
                count++;
                index++;
                if (a == 0) {
                    a = count;
                    count = 0;
                    index = 1;
                }
                else if (a != 0 && b == 0) b = count;
            }
            if (a != 0 && b != 0) break;
        }
        sb.append("! " + (a + b)).append("\n");
        System.out.print(sb);
        br.close();
    }
    public static void main(String[] args) throws IOException{
        new a_30917().run()
    }
}
