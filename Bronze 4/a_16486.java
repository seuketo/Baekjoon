import java.io.*;
import java.lang.Math;
public class a_16486 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public void run() throws Exception{
        double pie = Math.floor(Math.PI * 1000000) / 1000000;
        int d1 = Integer.parseInt(br.readLine());
        int d2 = Integer.parseInt(br.readLine());
        double sum = 0;
        sum += 2 * pie * d2;
        sum += d1 * 2;
        System.out.println(sum);
        br.close();
    }
    public static void main(String[] args) throws Exception{
        new a_16486().run();        
    }
}
