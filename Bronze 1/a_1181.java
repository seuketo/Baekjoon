import java.io.*;
public class a_1181 {
    public BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public void run() throws IOException{
        int n = Integer.parseInt(br.readLine());
        int len = n;
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = br.readLine();
            if (arr[i].length() < len) len = arr[i].length();
        }
        
    }
    public static void main(String[] args) throws IOException{
        new a_1181().run();
    }
}
