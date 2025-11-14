import java.io.*;
public class a_24723 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public void run() throws Exception{
        int n = Integer.parseInt(br.readLine());
        System.out.println((int) Math.pow(2, n));
        br.close();
    }
    public static void main(String[] args) throws Exception{
        new a_24723().run();
    }
}


