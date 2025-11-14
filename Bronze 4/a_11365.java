import java.io.*;
public class a_11365 {
    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private StringBuilder sb = new StringBuilder();
    private StringBuffer sf;
    public void run() throws Exception{
        String sen = "";
        while (true){            
            sen = br.readLine();
            if (sen.equals("END")) break;
            sf = new StringBuffer(sen);
            sb.append(sf.reverse().toString() + "\n");
            sf = new StringBuffer();
        }
        System.out.print(sb);
        br.close();
    }
    public static void main(String[] args) throws Exception{
        new a_11365().run();
    }
}
