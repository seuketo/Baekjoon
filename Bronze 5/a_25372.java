import java.io.*;
public class a_25372 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++){
            String a = br.readLine();
            if (a.length() >= 6 && a.length() <= 9) sb.append("yes\n");
            else sb.append("no\n");
        }
        System.out.print(sb);
        br.close();
    }
}
