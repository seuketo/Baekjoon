import java.io.*;
import java.lang.Math;

public class a_4696{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        double num;
        while ((num = Double.parseDouble(br.readLine())) != 0){
            double a = 1 + num + Math.pow(num, 2) + Math.pow(num, 3) + Math.pow(num, 4);
            bw.write(String.format("%.2f", a) + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
