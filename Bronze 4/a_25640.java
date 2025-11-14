import java.io.*;
public class a_25640 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public void run() throws Exception{
        String sen = br.readLine();
        int n = Integer.parseInt(br.readLine());
        int count = 0;
        for (int i = 0; i < n; i++) if (sen.equals(br.readLine())) count++;
        System.out.println(count);
        br.close();
    }
    public static void main(String[] args) throws Exception{
        new a_25640().run();
    }
}
