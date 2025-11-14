import java.io.*;
public class a_5789 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    public void run() throws IOException{
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++){
            String sen = br.readLine();
            int a = 0, b = sen.length() - 1;
            boolean result = false;
            while (true){
                if (a - b == 1) break;
                result = (sen.charAt(a) == sen.charAt(b) ? true : false);
                a++; b--;
            }    
            sb.append(result == true ? "Do-it\n" : "Do-it-Not\n");
        }
        System.out.print(sb);
        br.close();
    }
    public static void main(String[] args) throws IOException{
        new a_5789().run();
    }
}
