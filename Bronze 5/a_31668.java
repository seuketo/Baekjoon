import java.io.*;
public class a_31668 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public void run() throws Exception{
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        int k = Integer.parseInt(br.readLine());
        System.out.println(m / n * k);
        br.close();
    }
    public static void main(String[] args) throws Exception{
        new a_31668().run();        
    }
}
