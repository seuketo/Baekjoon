import java.io.*;
public class a_26068 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public void run() throws Exception{
        int n = Integer.parseInt(br.readLine());
        int count = 0;
        for (int i = 0; i < n; i++){
            String sen = br.readLine();
            int x = Integer.parseInt(sen.substring(2, sen.length()));
            if (x <= 90) count++;
        }
        System.out.println(count);
        br.close();
    }
    public static void main(String[] args) throws Exception{
        new a_26068().run();
    }
}
