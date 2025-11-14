import java.io.*;
public class a_5565 {
    public BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public void run() throws IOException{
        int total = Integer.parseInt(br.readLine());
        for (int i = 0; i < 9; i++) total -= Integer.parseInt(br.readLine());
        System.out.println(total);
        br.close();
    }
    public static void main(String[] args) throws IOException{
        new a_5565().run();
    }
}
