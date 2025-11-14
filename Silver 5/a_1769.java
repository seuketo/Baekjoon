import java.io.*;
public class a_1769 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    public void run() throws IOException{
        String sen = br.readLine();
        int count = 0;
        if (sen.length() != 1){
            while (true){
                int sum = 0;
                char[] arr = sen.toCharArray();
                for (char a : arr) sum += a - '0';
                sen = Integer.toString(sum);
                count++;
                if (sum < 10) break;
            }
        }
        sb.append(count).append("\n");
        if (Integer.parseInt(sen) % 3 == 0) sb.append("YES");
        else sb.append("NO");
        System.out.print(sb);
        br.close();
    }
    public static void main(String[] args) throws IOException{
        new a_1769().run();
    }
}
