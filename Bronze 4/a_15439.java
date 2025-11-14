import java.io.*;
public class a_15439 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public void run() throws Exception{
        int n = Integer.parseInt(br.readLine());
        System.out.println(n * (n - 1));
        br.close();
    }
    public static void main(String[] args) throws Exception{
        new a_15439().run();
    }
}
