import java.io.*;
public class a_2010 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public void run() throws IOException{
        int n = Integer.parseInt(br.readLine());
        int sum = 0;
        for (int i = 0; i < n; i++){
            int p = Integer.parseInt(br.readLine());
            sum += p;
            if (n >= 1 && i < n - 1) sum--;
        }
        System.out.println(sum);
        br.close();
    }
    public static void main(String[] args) throws IOException{
        new a_2010().run();
    }
}
