import java.io.*;

public class a_5554 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i = 0;
        int sec = 0;
        while (i < 4){
            int a = Integer.parseInt(br.readLine());
            sec += a;
            i++;
        }
        int m = sec / 60;
        System.out.println(m);
        System.out.println(sec - (m * 60));
        br.close();
    }
}
