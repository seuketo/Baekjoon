import java.io.*;
public class a_30030 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public void run() throws IOException{
        int b = Integer.parseInt(br.readLine());
        System.out.println((b / 11) * 10);
        br.close();
    }
    public static void main(String[] args) throws IOException{
        new a_30030().run();
    }
}
