import java.io.*;
public class a_31822 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public void run() throws Exception{
        String sen = br.readLine();
        int n = Integer.parseInt(br.readLine());
        int count = 0;
        for (int i = 0; i < n; i++){
            String sen_a = br.readLine();
            if ((sen.substring(0, 5)).equals(sen_a.substring(0, 5))) count++;
        }
        System.out.println(count);
        br.close();
    }
    public static void main(String[] args) throws Exception{
        new a_31822().run();
    }
}
