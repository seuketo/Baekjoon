import java.io.*;
import java.util.StringTokenizer;
import java.lang.Math;
public class a_15726 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    public void run() throws Exception{
        st = new StringTokenizer(br.readLine());
        double a = Double.parseDouble(st.nextToken());
        double b = Double.parseDouble(st.nextToken());
        double c = Double.parseDouble(st.nextToken());
        if (b > c) System.out.println(Math.round(Math.floor(a * b / c)));
        else System.out.println(Math.round(Math.floor(a / b * c)));
        br.close();
    }
    public static void main(String[] args) throws Exception{
        new a_15726().run();
    }
}