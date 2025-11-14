import java.io.*;
public class a_10101 {
    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private StringBuilder sb = new StringBuilder();
    public void run() throws Exception{
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        int total = a + b + c;
        if (total == 180) {
            if (a == b && b == c) sb.append("Equilateral");
            else if (a == b || b == c || a == c) sb.append("Isosceles");
            else sb.append("Scalene");
        }
        else sb.append("Error");
        System.out.print(sb);
        br.close();
    }
    public static void main(String[] args) throws Exception{
        new a_10101().run();
    }
}
