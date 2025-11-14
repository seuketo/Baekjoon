import java.io.*;
public class a_31403 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public void run() throws Exception{
        String a = br.readLine();
        String b = br.readLine();
        String c = br.readLine();
        System.out.println(Integer.parseInt(a) + Integer.parseInt(b) - Integer.parseInt(c));
        System.out.println(Integer.parseInt(a + b) - Integer.parseInt(c));
        br.close();
    }
    public static void main(String[] args) throws Exception{
        new a_31403().run();
    }
}
