import java.io.*;
public class a_6321 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    public void run() throws IOException{
        int n = Integer.parseInt(br.readLine());
        for (int i = 1; i <= n; i++){
            char[] arr = (br.readLine()).toCharArray();
            sb.append("String #" + i + "\n");
            for (int j = 0; j < arr.length; j++) {
                int num = (int) arr[j];
                if (num >= 90) sb.append((char) (65 + (num - 90)));
                else sb.append((char) (num + 1));
            }
            if (i != n) sb.append("\n\n");
        }
        System.out.print(sb);
        br.close();
    }
    public static void main(String[] args) throws IOException{
        new a_6321().run();
    }
}
