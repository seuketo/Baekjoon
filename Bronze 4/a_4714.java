import java.io.*;

public class a_4714 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        double num;
        while ((num = Double.parseDouble(br.readLine())) >= 0){
            bw.write("Objects weighing " + String.format("%.2f", num) + " on Earth will weigh " + String.format("%.2f", num * 0.167) + " on the moon.\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
