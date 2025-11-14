import java.io.*;
public class a_28352{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public void run() throws Exception{
        int n = Integer.parseInt(br.readLine());
        long factorial = 1;
        for (int i = 1; i <= n; i++) factorial *= i;
        long weeks = factorial / 604800;
        System.out.println(weeks);
        br.close();
    }
    public static void main(String[] args) throws Exception{
        new a_28352().run();
    }
}