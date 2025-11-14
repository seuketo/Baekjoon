import java.io.*;
public class a_27323 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        if (a >= 1 && a <= 100 && b >= 1 && b <= 100) sb.append(a * b);
        System.out.print(sb);
        br.close();
    }
}
