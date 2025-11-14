package Silver_5;
import java.io.*;
import java.util.*;

public class a_1312 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    public void run() throws IOException {
        st = new StringTokenizer(br.readLine());
        double a = Integer.parseInt(st.nextToken());
        double b = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        String sen = Double.toString(a / b);
        String num = sen.substring(sen.indexOf('.'));
        System.out.print(num.charAt(n));
        br.close();
    }
    public static void main(String[] args) {
        try{
            new a_1312().run();
        } catch (IOException e){
            System.err.println("Error: " + e.getMessage());
        }
    }
}
